SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;

-- INNER JOIN / JOIN natural
-- A interseccion B

SELECT 
students.*,
countries.*
FROM students
JOIN countries
ON students.nationality = countries.idCountries;

-- Informacion mas detallada de estudiantes
-- Funcion CONCAT
SELECT
CONCAT(students.name, ' ', students.last_name) AS 'Estudiante',
CONCAT(students.address, ', ', countries.Name) AS 'Direccion',
students.birthdate
FROM students
JOIN countries
ON students.nationality = countries.idCountries;

-- Estudiantes y sus tipos de ID
SELECT
CONCAT(students.name, ' ', students.last_name) AS 'Estudiante',
idtypes.name AS 'Tipo de identificacion'
FROM students
JOIN idtypes
ON students.idType_id = idtypes.id_idTypes;

-- Cantidad de estudiantes con tipo de ID DNI
SELECT
COUNT(idtypes.name)
FROM students
JOIN idtypes
ON students.IdType_id = idtypes.id_idTypes
WHERE idtypes.name = 'DNI';

SELECT
COUNT(IdType_id)
FROM students
WHERE IdType_id = 1;

SELECT COUNT(`IdType_id` = "DNI") FROM `students`;

-- 1. Encontrar a todo estudiante en el pais 125
-- 2. Encontrar a todo estudiante en paises que inicien con Ca
-- 3. Obtener info de estudiantes y obtener el codigo del curso que esten cursando
-- 4. Obtener el query anterior y tambien el nombre del curso en el que se encuentren 


