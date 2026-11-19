# Write your MySQL query statement below
select employee_id from Employees where salary < 30000 and manager_id is not null AND manager_id NOT IN (
      SELECT employee_id
      FROM Employees
  )
ORDER BY employee_id;;