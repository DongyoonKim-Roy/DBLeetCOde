/* Write your PL/SQL query statement below */
-- a balance higher than 10000
SELECT u.name, SUM(t.amount) AS balance
FROM Users u
JOIN Transactions t
ON u.account = t.account
GROUP BY u.name
HAVING sum(amount) > 10000