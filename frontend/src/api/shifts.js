import client from './client';
export const getCurrentShift = () => client.get('/api/shifts/current');
export const getAllShifts = () => client.get('/api/shifts');
export const openShift = () => client.post('/api/shifts');
export const closeShift = (id) => client.put(`/api/shifts/${id}/close`);
export const assignWaiterToShift = (shiftId, waiterId) =>
  client.post(`/api/shifts/${shiftId}/assign-waiter`, { waiterId });
export const joinShift = () => client.post('/api/shifts/join');
export const assignTableToWaiter = (shiftId, tableId, waiterId) =>
  client.post(`/api/shifts/${shiftId}/tables/${tableId}/assign`, { waiterId });
export const reassignWaiter = (shiftId, tableId, waiterId) =>
  client.put(`/api/shifts/${shiftId}/tables/${tableId}/reassign-waiter`, { waiterId });
