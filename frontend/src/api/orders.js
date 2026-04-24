import client from './client';
export const startOrder = (tableId) => client.post(`/api/tables/${tableId}/orders`);
export const getOrder = (orderId) => client.get(`/api/orders/${orderId}`);
export const addItem = (orderId, productId, quantity) =>
  client.post(`/api/orders/${orderId}/items`, { productId, quantity });
export const removeItem = (orderId, itemId) =>
  client.delete(`/api/orders/${orderId}/items/${itemId}`);
