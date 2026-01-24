SELECT 
    Department, 
    Employee, 
    Salary
FROM (
    SELECT 
        d.name AS Department, 
        e.name AS Employee, 
        e.salary AS Salary,
        -- DENSE_RANK handles ties correctly (e.g., if two people tie for 1st)
        DENSE_RANK() OVER (
            PARTITION BY e.departmentId 
            ORDER BY e.salary DESC
        ) AS salary_rank
    FROM Employee e
    JOIN Department d ON e.departmentId = d.id
) AS ranked_salaries
-- Only keep the top 3
WHERE salary_rank <= 3;