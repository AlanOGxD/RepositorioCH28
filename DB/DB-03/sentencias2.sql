-- Sentencias select basicas
SELECT * FROM bonus;
SELECT * FROM employee;
SELECT * FROM title;

-- SELECT + ALIAS
SELECT 
first_name AS 'Nombre',
last_name AS 'Apellido'
FROM employee;

-- Obtener a las personas con apellido Obama
SELECT
*
FROM employee
WHERE last_name = 'Obama';

-- Obtenemos a las personas con ID > 3 && salary > 200000
SELECT
*
FROM employee
WHERE employee_id > 3 AND salary > 200000;

-- Obtener personas que no se apelliden 'Vivek'
SELECT
*
FROM employee
WHERE NOT first_name = 'Vivek';

-- Obtener employees con salario de mayor a menor
SELECT
*
FROM employee
ORDER BY salary DESC;

-- Obtener employees con first_name de menor a mayor (alfabeticamente)
SELECT * FROM employee
ORDER BY first_name ASC;

-- Obtener employees con first_name de mayor a menor y salary de menor a mayor
SELECT * FROM employee
ORDER BY first_name DESC, salary ASC;

-- ---------------------
-- IN
-- Todas las coincidencias existentes dentro de la lista que filtremos
-- ---------------------

SELECT * FROM employee
WHERE employee_id IN (7,5,6,3);

--
-- Between
-- Todas las coincidencias existentes cumpliendo el rango
--

SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- LIMIT
SELECT * FROM employee
LIMIT 3;

-- OFFSET
SELECT * FROM employee
LIMIT 2 OFFSET 3;

--
-- LIKE
-- No es case sensitive
--

SELECT * FROM employee
WHERE first_name LIKE 'V%k';

-- Forzamos el case sensitive en LIKE
SELECT * FROM employee
WHERE first_name LIKE BINARY 'v%';

SELECT * FROM employee
WHERE first_name LIKE '%l%';

-- Actualizar a Barrack
-- Cambiar first_name = 'Luna'
UPDATE employee
SET
first_name = 'Luna'
WHERE employee_id = 7;

-- Insert 
-- Yareri
-- 900000 salario
-- CEO
-- Executive
INSERT INTO
employee
(first_name, last_name, salary, join_date,department)
VALUES
('Yareri', 'Arcos', 900000, '2023-07-13', 'Executive Board');