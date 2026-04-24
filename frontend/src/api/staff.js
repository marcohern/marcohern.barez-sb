import client from './client';
export const getStaff = () => client.get('/api/staff');
export const getStaffById = (id) => client.get(`/api/staff/${id}`);
export const createStaff = (data) => client.post('/api/staff', data);
export const updateStaff = (id, data) => client.put(`/api/staff/${id}`, data);
