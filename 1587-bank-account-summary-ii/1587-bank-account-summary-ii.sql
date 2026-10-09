# Write your MySQL query statement below
SELECT NAME, SUM(t.amount) as BALANCE
FROM Users u
JOIN Transactions t ON u.account=t.account
GROUP BY u.account,u.name
HAVING SUM(t.amount)>10000;