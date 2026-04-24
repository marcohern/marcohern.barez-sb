import { useState, useEffect, useCallback } from 'react';
import { useNavigate } from 'react-router-dom';
import { useAuth } from '../../context/AuthContext';
import { getCurrentShift, joinShift } from '../../api/shifts';
import { getTables, assignSelf } from '../../api/tables';

export default function MyShiftPage() {
  const { auth } = useAuth();
  const navigate = useNavigate();
  const [shift, setShift] = useState(null);
  const [tables, setTables] = useState([]);
  const [joined, setJoined] = useState(false);
  const [error, setError] = useState('');

  const load = useCallback(async () => {
    try {
      const [shiftRes, tablesRes] = await Promise.all([
        getCurrentShift().catch(() => ({ data: null })),
        getTables(),
      ]);
      setShift(shiftRes.data);
      setTables(tablesRes.data);
    } catch {
      setShift(null);
    }
  }, []);

  useEffect(() => { load(); }, [load]);

  async function handleJoin() {
    setError('');
    try {
      await joinShift();
      setJoined(true);
      load();
    } catch (err) {
      setError(err.response?.data?.message || 'Cannot join shift.');
    }
  }

  async function handleAssignSelf(tableId) {
    setError('');
    try {
      await assignSelf(tableId);
      load();
    } catch (err) {
      setError(err.response?.data?.message || 'Cannot assign table.');
    }
  }

  const availableTables = tables.filter((t) => t.status === 'AVAILABLE');
  const occupiedTables = tables.filter((t) => t.status === 'OCCUPIED');

  return (
    <div>
      <h2>My Shift</h2>
      {error && <div className="alert-error">{error}</div>}

      {!shift && <p className="muted">No shift is currently open. Ask your manager to open one.</p>}

      {shift && (
        <>
          <div className="info-card">
            <span>Shift #{shift.id}</span>
            <span>Status: <strong>{shift.status}</strong></span>
            <span>Since: {new Date(shift.openedAt).toLocaleString()}</span>
          </div>

          {!joined && shift.status === 'OPEN' && (
            <button className="btn-primary" style={{ marginTop: '1rem' }} onClick={handleJoin}>
              Join This Shift
            </button>
          )}
          {joined && <div className="alert-success">You joined the shift!</div>}

          <h3 style={{ marginTop: '1.5rem' }}>Available Tables</h3>
          {availableTables.length === 0 && <p className="muted">No available tables.</p>}
          <div className="table-grid">
            {availableTables.map((t) => (
              <div key={t.id} className="table-card">
                <strong>Table {t.tableNumber}</strong>
                <span className="badge available">AVAILABLE</span>
                <button className="btn-sm" onClick={() => handleAssignSelf(t.id)}>Assign to me</button>
              </div>
            ))}
          </div>

          <h3 style={{ marginTop: '1.5rem' }}>Occupied Tables</h3>
          {occupiedTables.length === 0 && <p className="muted">No occupied tables.</p>}
          <div className="table-grid">
            {occupiedTables.map((t) => (
              <div key={t.id} className="table-card occupied">
                <strong>Table {t.tableNumber}</strong>
                <span className="badge occupied">OCCUPIED</span>
                <button className="btn-sm" onClick={() => navigate(`/waiter/orders/${t.id}`)}>Attend</button>
              </div>
            ))}
          </div>
        </>
      )}
    </div>
  );
}
