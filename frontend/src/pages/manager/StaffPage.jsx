import { useState, useEffect, useCallback } from 'react';
import { getStaff, createStaff, updateStaff } from '../../api/staff';
import Modal from '../../components/Modal';

const EMPTY_FORM = { name: '', email: '', password: '', role: 'WAITER', active: true };

export default function StaffPage() {
  const [staff, setStaff] = useState([]);
  const [modal, setModal] = useState(null); // null | 'create' | {id, ...}
  const [form, setForm] = useState(EMPTY_FORM);
  const [error, setError] = useState('');

  const load = useCallback(async () => {
    const { data } = await getStaff();
    setStaff(data);
  }, []);

  useEffect(() => { load(); }, [load]);

  function openCreate() {
    setForm(EMPTY_FORM);
    setError('');
    setModal('create');
  }

  function openEdit(s) {
    setForm({ name: s.name, email: s.email, password: '', role: s.role, active: s.active });
    setError('');
    setModal(s);
  }

  function field(key) {
    return (e) => setForm((f) => ({ ...f, [key]: e.target.type === 'checkbox' ? e.target.checked : e.target.value }));
  }

  async function handleSave(e) {
    e.preventDefault();
    setError('');
    try {
      if (modal === 'create') {
        await createStaff({ name: form.name, email: form.email, password: form.password, role: form.role });
      } else {
        await updateStaff(modal.id, { name: form.name, role: form.role, active: form.active });
      }
      setModal(null);
      load();
    } catch (err) {
      setError(err.response?.data?.message || 'Error saving staff.');
    }
  }

  return (
    <div>
      <div className="page-header">
        <h2>Staff</h2>
        <button className="btn-primary" onClick={openCreate}>+ Add Staff</button>
      </div>
      <table className="data-table">
        <thead>
          <tr><th>Name</th><th>Email</th><th>Role</th><th>Active</th><th></th></tr>
        </thead>
        <tbody>
          {staff.map((s) => (
            <tr key={s.id}>
              <td>{s.name}</td>
              <td>{s.email}</td>
              <td>{s.role}</td>
              <td>{s.active ? 'Yes' : 'No'}</td>
              <td><button className="btn-sm" onClick={() => openEdit(s)}>Edit</button></td>
            </tr>
          ))}
        </tbody>
      </table>

      {modal && (
        <Modal title={modal === 'create' ? 'Add Staff' : 'Edit Staff'} onClose={() => setModal(null)}>
          <form onSubmit={handleSave} className="form-stack">
            {error && <div className="alert-error">{error}</div>}
            <label>Name
              <input value={form.name} onChange={field('name')} required />
            </label>
            <label>Email
              <input type="email" value={form.email} onChange={field('email')} required disabled={modal !== 'create'} />
            </label>
            {modal === 'create' && (
              <label>Password
                <input type="password" value={form.password} onChange={field('password')} required />
              </label>
            )}
            <label>Role
              <select value={form.role} onChange={field('role')}>
                <option value="WAITER">Waiter</option>
                <option value="MANAGER">Manager</option>
              </select>
            </label>
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
