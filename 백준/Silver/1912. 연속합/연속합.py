import sys
input = sys.stdin.readline

n = int(input())
num = list(map(int, input().split()))
sum = 0
res = [num[0]]

for i in range(1, n):
    res.append(max(num[i], res[i-1]+num[i]))

print(max(res))