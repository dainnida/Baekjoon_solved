-- 코드를 작성해주세요
SELECT e1.ID,
    CASE
        -- (나보다 큰 균들의 수) / (전체 균 수) 가 0.25 이하면 상위 25%
        WHEN (SELECT COUNT(*) FROM ECOLI_DATA e2
              WHERE e2.SIZE_OF_COLONY >= e1.SIZE_OF_COLONY) -- 나보다 크거나 같은 사이즈의 개수
              / (SELECT COUNT(*) FROM ECOLI_DATA) <= 0.25 THEN 'CRITICAL'
        WHEN (SELECT COUNT(*) FROM ECOLI_DATA e2
              WHERE e2.SIZE_OF_COLONY >= e1.SIZE_OF_COLONY)
              / (SELECT COUNT(*) FROM ECOLI_DATA) <= 0.5 THEN 'HIGH'
        WHEN (SELECT COUNT(*) FROM ECOLI_DATA e2
              WHERE e2.SIZE_OF_COLONY >= e1.SIZE_OF_COLONY)
              / (SELECT COUNT(*) FROM ECOLI_DATA) <= 0.75 THEN 'MEDIUM'
        ELSE 'LOW'
    END AS COLONY_NAME
FROM ECOLI_DATA e1
ORDER BY e1.ID; 