# import sys

# N, M = map(int, input().split())
# see = set()
# listen = set()

# for _ in range(N):
#     name = sys.stdin.readline().strip()
#     see.add(name)

# for _ in range(M):
#     name = sys.stdin.readline().strip()
#     listen.add(name)

# result = sorted(list(see & listen))
# print(len(result))
# print(*result, sep='\n')

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
