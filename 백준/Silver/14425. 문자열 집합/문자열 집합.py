import sys

N, M = map(int, input().split())
s = set()
count = 0

for _ in range(N):
    s.add(sys.stdin.readline())

for _ in range(M):
    check = sys.stdin.readline()
    if check in s:
        count += 1

print(count)