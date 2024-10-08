import sys
from collections import deque
input = sys.stdin.readline

N, K = map(int, input().split())
queue = deque([i+1 for i in range(N)])
res = []


for _ in range(N):
    for _ in range(K-1):
        queue.append(queue.popleft())
    res.append(queue.popleft())

print('<', end='')
print(*res, sep=', ', end='')
print('>', end='')
