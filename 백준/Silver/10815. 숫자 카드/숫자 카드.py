import sys

N = int(input())
cards = set(map(int, sys.stdin.readline().split()))
M = int(input())

finds = list(map(int, sys.stdin.readline().split()))
for i in finds:
    if i in cards:
        print(1, end=' ')
    else:
        print(0, end=' ')
