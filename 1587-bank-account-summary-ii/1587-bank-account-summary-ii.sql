select name, sum(amount) as balance
from transactions t
join users u
on u.account=t.account
group by name
having balance>10000;