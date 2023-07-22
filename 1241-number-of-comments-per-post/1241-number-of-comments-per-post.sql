SELECT a.post_id, COUNT(DISTINCT b.sub_id) AS number_of_comments
FROM Submissions b
RIGHT JOIN(
    SELECT DISTINCT sub_id post_id
    FROM Submissions
    WHERE parent_id is null
) a
ON  b.parent_id = a.post_id
GROUP BY a.post_id
ORDER BY a.post_id