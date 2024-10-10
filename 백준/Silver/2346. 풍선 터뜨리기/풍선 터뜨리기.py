import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
num = list(map(int, input().split()))
queue = deque([i+1 for i in range(N)])
result = []

result.append(queue.popleft())
while queue:
    if num[result[-1]-1] > 0:
        for _ in range(num[result[-1]-1] - 1):
            queue.append(queue.popleft())
        result.append(queue.popleft())
    else:
        for _ in range(-(num[result[-1]-1]) - 1):
            queue.appendleft(queue.pop())
        result.append(queue.pop())

print(*result)