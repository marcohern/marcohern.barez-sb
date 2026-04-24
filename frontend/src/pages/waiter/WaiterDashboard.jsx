import { useNavigate } from 'react-router-dom';
import { useAuth } from '../../context/AuthContext';

export default function WaiterDashboard() {
  const { auth } = useAuth();
  const navigate = useNavigate();

  return (
    <div>
      <h2>Welcome, {auth?.name}</h2>
      <div className="card-grid">
        <button className="nav-card" onClick={() => navigate('/waiter/shift')}>
          <strong>My Shift</strong>
          <span>Join the active shift and manage your tables</span>
        </button>
      </div>
    </div>
  );
}
