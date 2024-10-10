import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
queue = deque(enumerate(map(int, input().split())))
result = []


balloon, paper = queue.popleft()
result.append(balloon+1)
while queue:
    if paper > 0:
        for _ in range(paper - 1):
            queue.append(queue.popleft())
        balloon, paper = queue.popleft()
    else:
        for _ in range(-paper - 1):
            queue.appendleft(queue.pop())
        balloon, paper = queue.pop()
    result.append(balloon+1)

print(*result)