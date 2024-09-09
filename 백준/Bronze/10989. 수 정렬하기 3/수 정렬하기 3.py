import sys

N = int(input())
num = [0] * 10001

for _ in range(N):
    num[int(sys.stdin.readline())] += 1

for i in range(1, 10001):
    if num[i] != 0:
        for _ in range(num[i]):
            print(i)