select euni.unique_id,e.name
from Employees e left join EmployeeUNI euni
ON e.id=euni.id;