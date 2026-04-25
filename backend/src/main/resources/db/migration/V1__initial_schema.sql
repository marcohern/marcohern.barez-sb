-- V1__initial_schema.sql
-- Initial database schema for Barez bar management system

-- Users table
CREATE TABLE users (
    id BIGINT IDENTITY PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL,
    active BOOLEAN NOT NULL DEFAULT TRUE
);

-- Products table
CREATE TABLE products (
    id BIGINT IDENTITY PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(1000),
    price DECIMAL(19,2) NOT NULL,
    category VARCHAR(255),
    active BOOLEAN NOT NULL DEFAULT TRUE
);

-- Tables (bar tables)
CREATE TABLE tables (
    id BIGINT IDENTITY PRIMARY KEY,
    table_number INTEGER NOT NULL UNIQUE,
    status VARCHAR(50) NOT NULL DEFAULT 'AVAILABLE',
    active BOOLEAN NOT NULL DEFAULT TRUE
);

-- Work shifts
CREATE TABLE work_shifts (
    id BIGINT IDENTITY PRIMARY KEY,
    opened_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    closed_at TIMESTAMP,
    status VARCHAR(50) NOT NULL DEFAULT 'OPEN',
    opened_by_id BIGINT NOT NULL,
    FOREIGN KEY (opened_by_id) REFERENCES users(id)
);

-- Orders
CREATE TABLE orders (
    id BIGINT IDENTITY PRIMARY KEY,
    table_id BIGINT NOT NULL,
    shift_id BIGINT NOT NULL,
    status VARCHAR(50) NOT NULL DEFAULT 'OPEN',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    closed_at TIMESTAMP,
    FOREIGN KEY (table_id) REFERENCES tables(id),
    FOREIGN KEY (shift_id) REFERENCES work_shifts(id)
);

-- Order items
CREATE TABLE order_items (
    id BIGINT IDENTITY PRIMARY KEY,
    order_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    quantity INTEGER NOT NULL,
    unit_price DECIMAL(19,2) NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE,
    FOREIGN KEY (product_id) REFERENCES products(id)
);

-- Receipts
CREATE TABLE receipts (
    id BIGINT IDENTITY PRIMARY KEY,
    order_id BIGINT NOT NULL UNIQUE,
    total_amount DECIMAL(19,2) NOT NULL,
    pdf_path VARCHAR(500),
    generated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (order_id) REFERENCES orders(id)
);

-- Table assignments
CREATE TABLE table_assignments (
    id BIGINT IDENTITY PRIMARY KEY,
    table_id BIGINT NOT NULL,
    waiter_id BIGINT NOT NULL,
    shift_id BIGINT NOT NULL,
    assigned_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (table_id) REFERENCES tables(id),
    FOREIGN KEY (waiter_id) REFERENCES users(id),
    FOREIGN KEY (shift_id) REFERENCES work_shifts(id)
);

-- Shift assignments
CREATE TABLE shift_assignments (
    id BIGINT IDENTITY PRIMARY KEY,
    shift_id BIGINT NOT NULL,
    waiter_id BIGINT NOT NULL,
    assigned_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (shift_id) REFERENCES work_shifts(id),
    FOREIGN KEY (waiter_id) REFERENCES users(id),
    UNIQUE (shift_id, waiter_id)
);

-- Indexes for performance
CREATE INDEX idx_orders_shift ON orders(shift_id);
CREATE INDEX idx_orders_table ON orders(table_id);
CREATE INDEX idx_order_items_order ON order_items(order_id);
CREATE INDEX idx_work_shifts_status ON work_shifts(status);
CREATE INDEX idx_table_assignments_shift ON table_assignments(shift_id);