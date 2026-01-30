SELECT visited_on, amount, average_amount
FROM (
    SELECT 
        visited_on,
        SUM(SUM(amount)) OVER w AS amount,
        ROUND(SUM(SUM(amount)) OVER w / 7, 2) AS average_amount,
        -- Use DENSE_RANK or a window count to find the 7th unique day
        DENSE_RANK() OVER(ORDER BY visited_on) AS day_num
    FROM Customer
    GROUP BY visited_on
    WINDOW w AS (ORDER BY visited_on RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW)
) t
WHERE day_num >= 7;