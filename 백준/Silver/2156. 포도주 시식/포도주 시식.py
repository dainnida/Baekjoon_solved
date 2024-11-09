import sys
input = sys.stdin.readline

n = int(input())
wine = []
for _ in range(n):
    wine.append(int(input()))

DP = [wine[0]]
if n > 1:
    DP.append(wine[0]+wine[1])
if n > 2:
    DP.append(max(wine[0]+wine[2], wine[1]+wine[2], DP[1]))

for i in range(3, n):
    DP.append(max(wine[i-1]+DP[i-3]+ wine[i], DP[i-2]+ wine[i], DP[i-1]))

print(DP[n-1])