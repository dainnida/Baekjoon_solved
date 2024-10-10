import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
queue = deque(enumerate(map(int, input().split()), start=1))
result = []


while queue:
    balloon, paper = queue.popleft()
    result.append(balloon)

    if paper > 0:
        queue.rotate(-(paper-1))
    else:
        queue.rotate(-paper)

print(*result)