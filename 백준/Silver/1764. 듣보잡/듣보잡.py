import sys

N, M = map(int, input().split())
dic = {}
names = {}

for _ in range(N):
    name = sys.stdin.readline().strip()
    dic[name] = 1

for _ in range(M):
    name = sys.stdin.readline().strip()
    if dic.get(name) != None:
        names[name] = 1

names = sorted(names)
print(len(names))
print(*names, sep='\n')