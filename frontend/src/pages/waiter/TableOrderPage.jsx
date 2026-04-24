import { useState, useEffect, useCallback } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import { startOrder, getOrder, addItem, removeItem } from '../../api/orders';
import { getActiveProducts } from '../../api/products';
import { closeTable, moveTable, getTables } from '../../api/tables';
import { getReceiptPdfUrl } from '../../api/receipts';
import Modal from '../../components/Modal';

export default function TableOrderPage() {
  const { tableId } = useParams();
  const navigate = useNavigate();
  const [order, setOrder] = useState(null);
  const [products, setProducts] = useState([]);
  const [availableTables, setAvailableTables] = useState([]);
  const [receipt, setReceipt] = useState(null);
  const [selectedProduct, setSelectedProduct] = useState('');
  const [quantity, setQuantity] = useState(1);
  const [moveTarget, setMoveTarget] = useState('');
  const [showMove, setShowMove] = useState(false);
  const [error, setError] = useState('');
  const [loading, setLoading] = useState(false);

  const loadProducts = useCallback(async () => {
    const [prodRes, tablesRes] = await Promise.all([getActiveProducts(), getTables()]);
    setProducts(prodRes.data);
    setAvailableTables(tablesRes.data.filter((t) => t.status === 'AVAILABLE'));
  }, []);

  useEffect(() => { loadProducts(); }, [loadProducts]);

  async function handleStartOrder() {
    setError('');
    try {
      const { data } = await startOrder(tableId);
      setOrder(data);
    } catch (err) {
      setError(err.response?.data?.message || 'Cannot start order.');
    }
  }

  async function handleAddItem(e) {
    e.preventDefault();
    setError('');
    try {
      const { data } = await addItem(order.id, Number(selectedProduct), Number(quantity));
      setOrder((o) => ({ ...o, items: [...o.items, data] }));
      setSelectedProduct('');
      setQuantity(1);
    } catch (err) {
      setError(err.response?.data?.message || 'Cannot add item.');
    }
  }

  async function handleRemoveItem(itemId) {
    setError('');
    try {
      await removeItem(order.id, itemId);
      setOrder((o) => ({ ...o, items: o.items.filter((i) => i.id !== itemId) }));
    } catch (err) {
      setError(err.response?.data?.message || 'Cannot remove item.');
    }
  }

  async function handleClose() {
    setError('');
    setLoading(true);
    try {
      const { data } = await closeTable(tableId);
      setReceipt(data);
    } catch (err) {
      setError(err.response?.data?.message || 'Cannot close table.');
    } finally {
      setLoading(false);
    }
  }

  async function handleMove(e) {
    e.preventDefault();
    setError('');
    try {
      await moveTable(tableId, Number(moveTarget));
      setShowMove(false);
      navigate(`/waiter/orders/${moveTarget}`);
    } catch (err) {
      setError(err.response?.data?.message || 'Cannot move table.');
    }
  }

  const total = order?.items?.reduce((s, i) => s + i.lineTotal, 0) ?? 0;

  if (receipt) {
    return (
      <div>
        <h2>Receipt #{receipt.id}</h2>
        <div className="info-card">
          <span>Total: <strong>${receipt.totalAmount}</strong></span>
          <span>Generated: {new Date(receipt.generatedAt).toLocaleString()}</span>
        </div>
        <div className="form-actions" style={{ marginTop: '1rem' }}>
          <button className="btn-secondary" onClick={() => navigate('/waiter/shift')}>Back to Shift</button>
          <a href={getReceiptPdfUrl(receipt.id)} target="_blank" rel="noreferrer" className="btn-primary">
            Print PDF
          </a>
        </div>
      </div>
    );
  }

  return (
    <div>
      <div className="page-header">
        <h2>Table {tableId} — Order</h2>
        <button className="btn-secondary" onClick={() => navigate('/waiter/shift')}>← Back</button>
      </div>
      {error && <div className="alert-error">{error}</div>}

      {!order && (
        <button className="btn-primary" onClick={handleStartOrder}>Start Order</button>
      )}

      {order && (
        <>
          <form onSubmit={handleAddItem} className="add-item-row">
            <select value={selectedProduct} onChange={(e) => setSelectedProduct(e.target.value)} required>
              <option value="">Select product…</option>
              {products.map((p) => <option key={p.id} value={p.id}>{p.name} — ${p.price}</option>)}
            </select>
            <input type="number" min="1" value={quantity} onChange={(e) => setQuantity(e.target.value)} style={{ width: '5rem' }} />
            <button type="submit" className="btn-primary">Add</button>
          </form>

          <table className="data-table">
            <thead>
              <tr><th>Product</th><th>Qty</th><th>Unit</th><th>Total</th><th></th></tr>
            </thead>
            <tbody>
              {order.items.map((i) => (
                <tr key={i.id}>
                  <td>{i.productName}</td>
                  <td>{i.quantity}</td>
                  <td>${i.unitPrice}</td>
                  <td>${i.lineTotal}</td>
                  <td><button className="btn-sm btn-danger-sm" onClick={() => handleRemoveItem(i.id)}>✕</button></td>
                </tr>
              ))}
            </tbody>
          </table>
          <div className="order-total">Total: <strong>${total.toFixed(2)}</strong></div>

          <div className="form-actions" style={{ marginTop: '1rem' }}>
            <button className="btn-secondary" onClick={() => { setMoveTarget(''); setShowMove(true); }}>Move Table</button>
            <button className="btn-danger" onClick={handleClose} disabled={loading || order.items.length === 0}>
              {loading ? 'Closing…' : 'Close Table & Print Receipt'}
            </button>
          </div>
        </>
      )}

      {showMove && (
        <Modal title="Move Customers to Another Table" onClose={() => setShowMove(false)}>
          <form onSubmit={handleMove} className="form-stack">
            {error && <div className="alert-error">{error}</div>}
            <label>Destination Table
              <select value={moveTarget} onChange={(e) => setMoveTarget(e.target.value)} required>
                <option value="">Select…</option>
                {availableTables.map((t) => <option key={t.id} value={t.id}>Table {t.tableNumber}</option>)}
              </select>
            </label>
            <div className="form-actions">
              <button type="button" className="btn-secondary" onClick={() => setShowMove(false)}>Cancel</button>
              <button type="submit" className="btn-primary">Move</button>
            </div>
          </form>
        </Modal>
      )}
    </div>
  );
}
