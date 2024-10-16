import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
M = int(input())
C = list(map(int, input().split()))

queue = deque()
for i in range(N):
    if not A[i]:
        queue.append(B[i])

for c in C:
    queue.appendleft(c)
    print(queue.pop(), end=' ')