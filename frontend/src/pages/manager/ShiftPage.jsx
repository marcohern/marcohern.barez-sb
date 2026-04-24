import { useState, useEffect, useCallback } from 'react';
import { useNavigate } from 'react-router-dom';
import {
  getCurrentShift, openShift, closeShift,
  assignWaiterToShift, assignTableToWaiter, reassignWaiter,
} from '../../api/shifts';
import { getStaff } from '../../api/staff';
import { getTables, moveTable } from '../../api/tables';
import Modal from '../../components/Modal';

export default function ShiftPage() {
  const navigate = useNavigate();
  const [shift, setShift] = useState(null);
  const [staff, setStaff] = useState([]);
  const [tables, setTables] = useState([]);
  const [error, setError] = useState('');
  const [modal, setModal] = useState(null);
  const [selectedWaiter, setSelectedWaiter] = useState('');
  const [moveTarget, setMoveTarget] = useState('');

  const waiters = staff.filter((s) => s.role === 'WAITER' && s.active);

  const load = useCallback(async () => {
    try {
      const [shiftRes, staffRes, tablesRes] = await Promise.all([
        getCurrentShift().catch(() => ({ data: null })),
        getStaff(),
        getTables(),
      ]);
      setShift(shiftRes.data);
      setStaff(staffRes.data);
      setTables(tablesRes.data);
    } catch {
      setShift(null);
    }
  }, []);

  useEffect(() => { load(); }, [load]);

  async function handleOpen() {
    setError('');
    try { await openShift(); load(); }
    catch (err) { setError(err.response?.data?.message || 'Cannot open shift.'); }
  }

  async function handleClose() {
    setError('');
    try { await closeShift(shift.id); load(); }
    catch (err) { setError(err.response?.data?.message || 'Cannot close shift.'); }
  }

  async function handleAssignWaiter(e) {
    e.preventDefault();
    setError('');
    try {
      await assignWaiterToShift(shift.id, Number(selectedWaiter));
      setModal(null);
      setSelectedWaiter('');
    } catch (err) {
      setError(err.response?.data?.message || 'Error assigning waiter.');
    }
  }

  async function handleAssignTable(e) {
    e.preventDefault();
    setError('');
    try {
      await assignTableToWaiter(shift.id, modal.tableId, Number(selectedWaiter));
      setModal(null);
      setSelectedWaiter('');
      load();
    } catch (err) {
      setError(err.response?.data?.message || 'Error assigning table.');
    }
  }

  async function handleReassignWaiter(e) {
    e.preventDefault();
    setError('');
    try {
      await reassignWaiter(shift.id, modal.tableId, Number(selectedWaiter));
      setModal(null);
      setSelectedWaiter('');
      load();
    } catch (err) {
      setError(err.response?.data?.message || 'Error reassigning waiter.');
    }
  }

  async function handleMoveTable(e) {
    e.preventDefault();
    setError('');
    try {
      await moveTable(modal.tableId, Number(moveTarget));
      setModal(null);
      setMoveTarget('');
      load();
    } catch (err) {
      setError(err.response?.data?.message || 'Error moving table.');
    }
  }

  const occupiedTables = tables.filter((t) => t.status === 'OCCUPIED');
  const availableTables = tables.filter((t) => t.status === 'AVAILABLE');

  return (
    <div>
      <div className="page-header">
        <h2>Shift Management</h2>
        {!shift && <button className="btn-primary" onClick={handleOpen}>Open Shift</button>}
        {shift && shift.status === 'OPEN' && (
          <button className="btn-danger" onClick={handleClose}>Close Shift</button>
        )}
      </div>
      {error && <div className="alert-error">{error}</div>}

      {!shift && <p className="muted">No shift is currently open.</p>}

      {shift && (
        <>
          <div className="info-card">
            <span>Shift #{shift.id}</span>
            <span>Opened by {shift.openedByName}</span>
            <span>Status: <strong>{shift.status}</strong></span>
            <span>Since: {new Date(shift.openedAt).toLocaleString()}</span>
          </div>

          {shift.status === 'OPEN' && (
            <button className="btn-secondary" onClick={() => { setSelectedWaiter(''); setError(''); setModal({ type: 'assignWaiter' }); }}>
              + Assign Waiter to Shift
            </button>
          )}

          <h3 style={{ marginTop: '1.5rem' }}>Tables</h3>

          {shift.status === 'OPEN' && availableTables.length > 0 && (
            <div className="table-grid" style={{ marginBottom: '1rem' }}>
              {availableTables.map((t) => (
                <div key={t.id} className="table-card">
                  <strong>Table {t.tableNumber}</strong>
                  <span className="badge available">AVAILABLE</span>
                  <button className="btn-sm" onClick={() => { setSelectedWaiter(''); setError(''); setModal({ type: 'assignTable', tableId: t.id, tableNumber: t.tableNumber }); }}>
                    Assign Waiter
                  </button>
                </div>
              ))}
            </div>
          )}

          {occupiedTables.length > 0 && (
            <div className="table-grid">
              {occupiedTables.map((t) => (
                <div key={t.id} className="table-card occupied">
                  <strong>Table {t.tableNumber}</strong>
                  <span className="badge occupied">OCCUPIED</span>
                  <div className="table-card-actions">
                    <button className="btn-sm" onClick={() => navigate(`/manager/orders/${t.id}`)}>View Order</button>
                    {shift.status === 'OPEN' && <>
                      <button className="btn-sm" onClick={() => { setSelectedWaiter(''); setError(''); setModal({ type: 'reassign', tableId: t.id, tableNumber: t.tableNumber }); }}>
                        Reassign Waiter
                      </button>
                      <button className="btn-sm" onClick={() => { setMoveTarget(''); setError(''); setModal({ type: 'move', tableId: t.id, tableNumber: t.tableNumber }); }}>
                        Move Table
                      </button>
                    </>}
                  </div>
                </div>
              ))}
            </div>
          )}
        </>
      )}

      {modal?.type === 'assignWaiter' && (
        <Modal title="Assign Waiter to Shift" onClose={() => setModal(null)}>
          <form onSubmit={handleAssignWaiter} className="form-stack">
            {error && <div className="alert-error">{error}</div>}
            <label>Waiter
              <select value={selectedWaiter} onChange={(e) => setSelectedWaiter(e.target.value)} required>
                <option value="">Select…</option>
                {waiters.map((w) => <option key={w.id} value={w.id}>{w.name}</option>)}
              </select>
            </label>
            <div className="form-actions">
              <button type="button" className="btn-secondary" onClick={() => setModal(null)}>Cancel</button>
              <button type="submit" className="btn-primary">Assign</button>
            </div>
          </form>
        </Modal>
      )}

      {(modal?.type === 'assignTable' || modal?.type === 'reassign') && (
        <Modal title={modal.type === 'assignTable' ? `Assign Table ${modal.tableNumber}` : `Reassign Table ${modal.tableNumber}`} onClose={() => setModal(null)}>
          <form onSubmit={modal.type === 'assignTable' ? handleAssignTable : handleReassignWaiter} className="form-stack">
            {error && <div className="alert-error">{error}</div>}
            <label>Waiter
              <select value={selectedWaiter} onChange={(e) => setSelectedWaiter(e.target.value)} required>
                <option value="">Select…</option>
                {waiters.map((w) => <option key={w.id} value={w.id}>{w.name}</option>)}
              </select>
            </label>
            <div className="form-actions">
              <button type="button" className="btn-secondary" onClick={() => setModal(null)}>Cancel</button>
              <button type="submit" className="btn-primary">Confirm</button>
            </div>
          </form>
        </Modal>
      )}

      {modal?.type === 'move' && (
        <Modal title={`Move Table ${modal.tableNumber} to…`} onClose={() => setModal(null)}>
          <form onSubmit={handleMoveTable} className="form-stack">
            {error && <div className="alert-error">{error}</div>}
            <label>Destination Table
              <select value={moveTarget} onChange={(e) => setMoveTarget(e.target.value)} required>
                <option value="">Select…</option>
                {availableTables.map((t) => <option key={t.id} value={t.id}>Table {t.tableNumber}</option>)}
              </select>
            </label>
            <div className="form-actions">
              <button type="button" className="btn-secondary" onClick={() => setModal(null)}>Cancel</button>
              <button type="submit" className="btn-primary">Move</button>
            </div>
          </form>
        </Modal>
      )}
    </div>
  );
}
