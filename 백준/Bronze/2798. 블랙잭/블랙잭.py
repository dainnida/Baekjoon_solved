from itertools import combinations

N, M = map(int, input().split())
num = list(map(int, input().split()))
result = 0

for three in combinations(num, 3):
    if sum(three) <= M and sum(three) > result:
        result = sum(three)

print(result)
