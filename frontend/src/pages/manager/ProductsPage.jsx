import { useState, useEffect, useCallback } from 'react';
import { getProducts, createProduct, updateProduct } from '../../api/products';
import Modal from '../../components/Modal';

const EMPTY = { name: '', description: '', price: '', category: '', active: true };

export default function ProductsPage() {
  const [products, setProducts] = useState([]);
  const [modal, setModal] = useState(null);
  const [form, setForm] = useState(EMPTY);
  const [error, setError] = useState('');

  const load = useCallback(async () => {
    const { data } = await getProducts();
    setProducts(data);
  }, []);

  useEffect(() => { load(); }, [load]);

  function openCreate() { setForm(EMPTY); setError(''); setModal('create'); }
  function openEdit(p) {
    setForm({ name: p.name, description: p.description || '', price: p.price, category: p.category || '', active: p.active });
    setError('');
    setModal(p);
  }

  function field(key) {
    return (e) => setForm((f) => ({ ...f, [key]: e.target.type === 'checkbox' ? e.target.checked : e.target.value }));
  }

  async function handleSave(e) {
    e.preventDefault();
    setError('');
    const payload = { name: form.name, description: form.description, price: Number(form.price), category: form.category, active: form.active };
    try {
      if (modal === 'create') {
        await createProduct(payload);
      } else {
        await updateProduct(modal.id, payload);
      }
      setModal(null);
      load();
    } catch (err) {
      setError(err.response?.data?.message || 'Error saving product.');
    }
  }

  return (
    <div>
      <div className="page-header">
        <h2>Products</h2>
        <button className="btn-primary" onClick={openCreate}>+ Add Product</button>
      </div>
      <table className="data-table">
        <thead>
          <tr><th>Name</th><th>Category</th><th>Price</th><th>Active</th><th></th></tr>
        </thead>
        <tbody>
          {products.map((p) => (
            <tr key={p.id} className={!p.active ? 'row-inactive' : ''}>
              <td>{p.name}</td>
              <td>{p.category || '—'}</td>
              <td>${p.price}</td>
              <td>{p.active ? 'Yes' : 'No'}</td>
              <td><button className="btn-sm" onClick={() => openEdit(p)}>Edit</button></td>
            </tr>
          ))}
        </tbody>
      </table>

      {modal && (
        <Modal title={modal === 'create' ? 'Add Product' : 'Edit Product'} onClose={() => setModal(null)}>
          <form onSubmit={handleSave} className="form-stack">
            {error && <div className="alert-error">{error}</div>}
            <label>Name<input value={form.name} onChange={field('name')} required /></label>
            <label>Description<input value={form.description} onChange={field('description')} /></label>
            <label>Price<input type="number" step="0.01" min="0.01" value={form.price} onChange={field('price')} required /></label>
            <label>Category<input value={form.category} onChange={field('category')} /></label>
            {modal !== 'create' && (
              <label className="checkbox-label">
                <input type="checkbox" checked={form.active} onChange={field('active')} /> Active
              </label>
            )}
            <div className="form-actions">
              <button type="button" className="btn-secondary" onClick={() => setModal(null)}>Cancel</button>
              <button type="submit" className="btn-primary">Save</button>
            </div>
          </form>
        </Modal>
      )}
    </div>
  );
}
