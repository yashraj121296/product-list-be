-- Create table
CREATE TABLE products
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    name     VARCHAR(255),
    category VARCHAR(255),
    price    DOUBLE,
    stocked  BOOLEAN
);

-- Insert data
INSERT INTO products (name, category, price, stocked)
VALUES ('Apple', 'Fruits', 1.0, true),
       ('Dragonfruit', 'Fruits', 1.0, true),
       ('Passionfruit', 'Fruits', 2.0, false),
       ('Spinach', 'Vegetables', 2.0, true),
       ('Pumpkin', 'Vegetables', 4.0, false),
       ('Peas', 'Vegetables', 1.0, true);
