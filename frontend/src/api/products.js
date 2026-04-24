import client from './client';
export const getProducts = () => client.get('/api/products');
export const getActiveProducts = () => client.get('/api/products?active=true');
export const createProduct = (data) => client.post('/api/products', data);
export const updateProduct = (id, data) => client.put(`/api/products/${id}`, data);
