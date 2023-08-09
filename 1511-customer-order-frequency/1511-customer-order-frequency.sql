# Write your MySQL query statement below
SELECT c.customer_id, c.name
FROM Customers c
JOIN Orders o
ON c.customer_id = o.customer_id
JOIN Product p
ON p.product_id = o.product_id
GROUP BY c.customer_id
HAVING SUM(
    IF(o.order_date BETWEEN '2020-06-01' AND '2020-06-30', o.quantity, 0) * p.price 
    ) >= 100 
    AND
    SUM(
    IF(o.order_date BETWEEN '2020-07-01' AND '2020-07-31', o.quantity, 0) * p.price 
    ) >= 100 
