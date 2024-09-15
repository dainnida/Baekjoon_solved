import sys

N, M = map(int, input().split())
dic = {}
count = 0

for _ in range(N):
    dic[sys.stdin.readline()] = 1

for _ in range(M):
    check = sys.stdin.readline()
    if check in dic:
        count += 1

print(count)