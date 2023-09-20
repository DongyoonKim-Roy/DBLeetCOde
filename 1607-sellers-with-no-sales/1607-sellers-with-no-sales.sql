/* Write your PL/SQL query statement below */

SELECT seller_name
FROM seller
WHERE seller_id NOT IN(
    SELECT seller_id
    FROM Orders
    WHERE sale_date LIKE '2020%'
)
ORDER BY seller_name ASC