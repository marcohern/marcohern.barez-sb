import { useState, useEffect, useCallback } from 'react';
import { getTables, createTable } from '../../api/tables';
import Modal from '../../components/Modal';

export default function TablesPage() {
  const [tables, setTables] = useState([]);
  const [showModal, setShowModal] = useState(false);
  const [tableNumber, setTableNumber] = useState('');
  const [error, setError] = useState('');

  const load = useCallback(async () => {
    const { data } = await getTables();
    setTables(data);
  }, []);

  useEffect(() => { load(); }, [load]);

  async function handleCreate(e) {
    e.preventDefault();
    setError('');
    try {
      await createTable(Number(tableNumber));
      setShowModal(false);
      setTableNumber('');
      load();
    } catch (err) {
      setError(err.response?.data?.message || 'Error creating table.');
    }
  }

  return (
    <div>
      <div className="page-header">
        <h2>Tables</h2>
        <button className="btn-primary" onClick={() => { setShowModal(true); setError(''); }}>+ Add Table</button>
      </div>
      <div className="table-grid">
        {tables.map((t) => (
          <div key={t.id} className={`table-card ${t.status === 'OCCUPIED' ? 'occupied' : ''}`}>
            <strong>Table {t.tableNumber}</strong>
            <span className="badge">{t.status}</span>
          </div>
        ))}
      </div>

      {showModal && (
        <Modal title="Add Table" onClose={() => setShowModal(false)}>
          <form onSubmit={handleCreate} className="form-stack">
            {error && <div className="alert-error">{error}</div>}
            <label>Table Number
              <input type="number" min="1" value={tableNumber} onChange={(e) => setTableNumber(e.target.value)} required autoFocus />
            </label>
            <div className="form-actions">
              <button type="button" className="btn-secondary" onClick={() => setShowModal(false)}>Cancel</button>
              <button type="submit" className="btn-primary">Create</button>
            </div>
          </form>
        </Modal>
      )}
    </div>
  );
}
