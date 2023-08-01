# Write your MySQL query statement below
SELECT s.id, s.name
FROM Departments d
RIGHT JOIN Students s
ON s.department_id = d.id
WHERE d.id is NULL

