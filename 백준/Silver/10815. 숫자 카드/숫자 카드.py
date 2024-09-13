import sys

N = int(input())
cards = list(map(int, sys.stdin.readline().split()))
M = int(input())
finds = list(map(int, sys.stdin.readline().split()))

dic = {}
for i in cards:
    dic[i] = 1

for i in finds:
    if i in dic:
        print(1, end=' ')
    else:
         print(0, end=' ')
