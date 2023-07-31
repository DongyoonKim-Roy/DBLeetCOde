# Write your MySQL query statement below
SELECT ad_id, 
IFNULL(
    ROUND(SUM(action = 'Clicked') / SUM(action = 'Clicked' OR action = 'Viewed') * 100, 2), 0
) AS ctr

FROM Ads
GROUP BY ad_id
order by ctr desc, ad_id