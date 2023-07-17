-- Obtener el total de estudiantes por cada modulo
-- Agrupacion (GROUP BY)

-- students
-- courses_has_students
-- courses
-- modules
-- Agrupar por modulo
-- Contar estudiantes
-- Alias para nuestras funciones

SELECT
	t4.name AS 'Modulo',
	COUNT(t1.idStudent) AS 'Total de estudiantes en el modulo'
FROM students t1
JOIN courses_has_students t2
	ON t1.idStudent = t2.students_id_student
JOIN courses t3
	ON t2.course_code = t3.code
JOIN modules t4
	ON t3.module_code = t4.code
GROUP BY t4.code
ORDER BY COUNT(t1.idStudent) DESC;

-- LEFT OUTER JOIN
-- LEFT JOIN nulo

-- Encontrar estudiantes sin curso
-- Union de students ->
-- courses_has_students
-- Estudiantes + id, nombre completo
-- Aplicar outer join

SELECT
	t1.idStudent AS 'ID',
	CONCAT(t1.name, ' ', t1.last_name) AS 'Estudiante'
FROM students t1
LEFT OUTER JOIN courses_has_students t2
	ON t1.idStudent = t2.students_id_student
WHERE t2.students_id_student IS NULL;

-- bd business
-- Encontrar employees sin bono

