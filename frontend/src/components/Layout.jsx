import { Outlet, NavLink, useNavigate } from 'react-router-dom';
import { useAuth } from '../context/AuthContext';

export default function Layout() {
  const { auth, logout } = useAuth();
  const navigate = useNavigate();

  function handleLogout() {
    logout();
    navigate('/login');
  }

  const isManager = auth?.role === 'MANAGER';

  return (
    <div className="app-shell">
      <nav className="sidebar">
        <div className="sidebar-header">
          <span className="sidebar-title">Barez</span>
          <span className="sidebar-role">{auth?.role}</span>
        </div>
        <ul className="nav-list">
          {isManager && <>
            <li><NavLink to="/manager" end>Dashboard</NavLink></li>
            <li><NavLink to="/manager/shift">Shift</NavLink></li>
            <li><NavLink to="/manager/staff">Staff</NavLink></li>
            <li><NavLink to="/manager/tables">Tables</NavLink></li>
            <li><NavLink to="/manager/products">Products</NavLink></li>
          </>}
          {!isManager && <>
            <li><NavLink to="/waiter" end>Dashboard</NavLink></li>
            <li><NavLink to="/waiter/shift">My Shift</NavLink></li>
          </>}
        </ul>
        <div className="sidebar-footer">
          <span className="sidebar-user">{auth?.name}</span>
          <button className="btn-link" onClick={handleLogout}>Logout</button>
        </div>
      </nav>
      <main className="page-content">
        <Outlet />
      </main>
    </div>
  );
}
