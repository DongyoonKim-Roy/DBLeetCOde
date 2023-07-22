# Write your MySQL query statement below
SELECT p.firstName, p.lastName, ad.city, ad.state
FROM Person p
LEFT JOIN Address ad
ON ad.personId = p.personId
