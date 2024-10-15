import sys
input = sys.stdin.readline

N = int(input())
s = set()
count = 0

for _ in range(N):
    name = input().strip()
    if name == 'ENTER':
        s.clear()
    elif name not in s:
        s.add(name)
        count += 1

print(count)