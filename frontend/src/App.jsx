import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';
import { AuthProvider, useAuth } from './context/AuthContext';
import Login from './pages/Login';
import Layout from './components/Layout';
import ManagerDashboard from './pages/manager/ManagerDashboard';
import StaffPage from './pages/manager/StaffPage';
import TablesPage from './pages/manager/TablesPage';
import ProductsPage from './pages/manager/ProductsPage';
import ShiftPage from './pages/manager/ShiftPage';
import OrderPage from './pages/manager/OrderPage';
import WaiterDashboard from './pages/waiter/WaiterDashboard';
import MyShiftPage from './pages/waiter/MyShiftPage';
import TableOrderPage from './pages/waiter/TableOrderPage';

function RootRedirect() {
  const { auth } = useAuth();
  if (!auth) return <Navigate to="/login" replace />;
  return auth.role === 'MANAGER'
    ? <Navigate to="/manager" replace />
    : <Navigate to="/waiter" replace />;
}

function RequireAuth({ role, children }) {
  const { auth } = useAuth();
  if (!auth) return <Navigate to="/login" replace />;
  if (role && auth.role !== role) return <Navigate to="/" replace />;
  return children;
}

export default function App() {
  return (
    <AuthProvider>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<RootRedirect />} />
          <Route path="/login" element={<Login />} />
          <Route path="/manager" element={<RequireAuth role="MANAGER"><Layout /></RequireAuth>}>
            <Route index element={<ManagerDashboard />} />
            <Route path="staff" element={<StaffPage />} />
            <Route path="tables" element={<TablesPage />} />
            <Route path="products" element={<ProductsPage />} />
            <Route path="shift" element={<ShiftPage />} />
            <Route path="orders/:tableId" element={<OrderPage />} />
          </Route>
          <Route path="/waiter" element={<RequireAuth role="WAITER"><Layout /></RequireAuth>}>
            <Route index element={<WaiterDashboard />} />
            <Route path="shift" element={<MyShiftPage />} />
            <Route path="orders/:tableId" element={<TableOrderPage />} />
          </Route>
        </Routes>
      </BrowserRouter>
    </AuthProvider>
  );
}
