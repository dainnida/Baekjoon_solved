import sys
input = sys.stdin.readline
import heapq

N = int(input())
heap = []

for _ in range(N):
    op = int(input())
    if op == 0:
        if heap:
            print(-(heapq.heappop(heap)))
        else:
            print(0)
    else:
        heapq.heappush(heap, -op)