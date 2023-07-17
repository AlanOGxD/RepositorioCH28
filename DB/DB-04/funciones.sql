USE business;
SELECT * FROM employee;

-- MIN
SELECT
MIN(salary) AS 'Minimo salario'
FROM employee;

SELECT
MIN(first_name) AS 'Nombre minimo'
FROM employee;

-- MAX
SELECT
MAX(salary) AS 'Maximo salario'
FROM employee;

-- COUNT
SELECT
COUNT(salary) AS 'Total conteo de salarios'
FROM employee;

-- COUNT + DISTINCT
SELECT
COUNT(DISTINCT(salary)) AS 'Total conteo de salarios no duplicados'
FROM employee;

-- AVG
SELECT
AVG(salary) AS 'Salario promedio'
FROM employee;

SELECT
AVG(join_date) AS 'Fecha de inicio promedio'
FROM employee;

-- Promedio de fechas
SELECT
DATE_ADD('1970-01-01', INTERVAL AVG(DATEDIFF(join_date, '1970-01-01')) DAY) AS 'Fecha promedio de inicio'
FROM employee;

-- SUM
SELECT
SUM(salary) AS 'Total de suma de salarios'
FROM employee;