import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
queue = deque()

for _ in range(N):
    num = list(map(int, input().split()))
    command = num[0]
    if command == 1:
        queue.appendleft(num[1])
    elif command == 2:
        queue.append(num[1])
    elif command == 3:
        print(queue.popleft() if queue else -1)
    elif command == 4:
        print(queue.pop() if queue else -1)
    elif command == 5:
        print(len(queue))
    elif command == 6:
        print(0 if queue else 1)
    elif command == 7:
        print(queue[0] if queue else -1)
    elif command == 8:
        print(queue[-1] if queue else -1)