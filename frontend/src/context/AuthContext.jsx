import { createContext, useContext, useState } from 'react';
import { login as apiLogin } from '../api/auth';

const AuthContext = createContext(null);

export function AuthProvider({ children }) {
  const [auth, setAuth] = useState(() => {
    const token = localStorage.getItem('token');
    const userId = localStorage.getItem('userId');
    const name = localStorage.getItem('name');
    const role = localStorage.getItem('role');
    return token ? { token, userId, name, role } : null;
  });

  async function login(email, password) {
    const { data } = await apiLogin(email, password);
    localStorage.setItem('token', data.token);
    localStorage.setItem('userId', data.userId);
    localStorage.setItem('name', data.name);
    localStorage.setItem('role', data.role);
    setAuth({ token: data.token, userId: data.userId, name: data.name, role: data.role });
    return data.role;
  }

  function logout() {
    localStorage.clear();
    setAuth(null);
  }

  return <AuthContext.Provider value={{ auth, login, logout }}>{children}</AuthContext.Provider>;
}

export const useAuth = () => useContext(AuthContext);
