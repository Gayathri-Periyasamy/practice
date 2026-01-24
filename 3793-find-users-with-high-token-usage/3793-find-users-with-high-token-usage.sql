SELECT USER_ID,COUNT(PROMPT) as prompt_count,
round (sum(tokens)/count(prompt),2) as avg_tokens
from PROMPTS
group by USER_ID having count(prompt)>2 and max(tokens)>avg(tokens)
order by round(Sum(TOKENS)/COUNT(PROMPT),2) desc,user_id
