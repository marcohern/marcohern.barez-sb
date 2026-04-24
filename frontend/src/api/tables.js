import client from './client';
export const getTables = () => client.get('/api/tables');
export const createTable = (tableNumber) => client.post('/api/tables', { tableNumber });
export const assignSelf = (tableId) => client.post(`/api/tables/${tableId}/assign-self`);
export const moveTable = (tableId, toTableId) => client.put(`/api/tables/${tableId}/move`, { toTableId });
export const closeTable = (tableId) => client.post(`/api/tables/${tableId}/close`);
