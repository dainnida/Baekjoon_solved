-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.NAME
FROM ANIMAL_INS i
JOIN ANIMAL_OUTS o
ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE i.DATETIME > o.DATETIME -- 입양일이 더 빠르다 = 더 과거다 = 숫자가 더 작다
ORDER BY i.DATETIME; -- 빠른 순 = 더 과거 = 작은 거에서 큰 순으로