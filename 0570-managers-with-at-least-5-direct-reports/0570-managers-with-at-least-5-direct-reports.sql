# Write your MySQL query statement below
select e.name
from Employee e
join(
    select managerId
    from employee
    group by managerid
    having count(*)>=5
)m
on e.id=m.managerId;
