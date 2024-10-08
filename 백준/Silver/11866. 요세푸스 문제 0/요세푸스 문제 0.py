import sys
input = sys.stdin.readline

N, K = map(int, input().split())
num = 0
len = N

list = [i+1 for i in range(N)]

print('<', end='')

for _ in range(N):
    num += K-1
    while num >= len:
        num -= len
    print(list.pop(num), end='')
    len -= 1
    if len != 0:
        print(', ', end='')

print('>', end='')