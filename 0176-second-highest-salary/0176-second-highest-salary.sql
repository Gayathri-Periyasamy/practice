# Write your MySQL query statement below
select (select distinct salary from Employee group by salary order by salary desc LIMIT 1 OFFSET 1)
as SecondHighestSalary
 
