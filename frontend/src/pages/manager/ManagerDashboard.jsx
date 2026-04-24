import { useNavigate } from 'react-router-dom';
import { useAuth } from '../../context/AuthContext';

export default function ManagerDashboard() {
  const { auth } = useAuth();
  const navigate = useNavigate();

  const cards = [
    { label: 'Shift', desc: 'Open/close shifts and manage table assignments', path: '/manager/shift' },
    { label: 'Staff', desc: 'Create and manage staff accounts', path: '/manager/staff' },
    { label: 'Tables', desc: 'Add and view bar tables', path: '/manager/tables' },
    { label: 'Products', desc: 'Manage the product catalog', path: '/manager/products' },
  ];

  return (
    <div>
      <h2>Welcome, {auth?.name}</h2>
      <div className="card-grid">
        {cards.map((c) => (
          <button key={c.path} className="nav-card" onClick={() => navigate(c.path)}>
            <strong>{c.label}</strong>
            <span>{c.desc}</span>
          </button>
        ))}
      </div>
    </div>
  );
}
