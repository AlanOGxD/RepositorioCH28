-- SQL
-- Structured Query Language
-- Query = Pregunta/solicitud


-- SELECT 
-- Selecciona lo que le indiquemos de una o mas tablas
SELECT * FROM products;
SELECT * FROM category;


-- Sentencia para seleccionar una BD
USE mydb;

-- Insertar informacion a la tabla category
INSERT INTO category
(idCategory, name, department)
VALUES
(null, "Electrodomesticos", "Hogar");


-- Insertar sin especificar columnas
INSERT INTO category
VALUES
(null, "Juguetes", "Entretenimiento"),
(null, "Vinos y licores", "Bebidas");
-- Podemos insertar multiples filas en la misma sentencia

-- SELECT Columnas
SELECT name, department FROM category;

-- SELECT con filtro WHERE
SELECT *
FROM category
WHERE idCategory = 1;

-- Modificacion de un dato UPDATE
-- Actualiza tabla category
-- Coloca el valor de Entretenimiento donde el idCategory sea igual a 3
UPDATE
category
SET
department = 'Entretenimiento'
WHERE idCategory = 3;

-- Eliminar un dato
DELETE
FROM category
WHERE idCategory = 2;


-- Query para insertar un producto
-- CREATE
-- FROM category
-- WHERE name 

-- INSERT un producto
INSERT
INTO products
(idProducts, name, price, brand, description, inStock, Category_idCategory)
VALUES
(null, 'Miller', 40.0, 'Miller Brewing Company', 'Bebida alcoholica tipo cerveza clara', 5, 3);