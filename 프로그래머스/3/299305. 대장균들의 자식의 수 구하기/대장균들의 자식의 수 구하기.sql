-- 코드를 작성해주세요
SELECT p.ID, COUNT(c.id) AS CHILD_COUNT
FROM ECOLI_DATA p
LEFT JOIN ECOLI_DATA c
ON p.id = c.parent_id
GROUP BY p.id
ORDER BY p.id;