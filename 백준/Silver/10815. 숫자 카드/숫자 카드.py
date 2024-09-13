import sys

N = int(input())
cards = list(map(int, sys.stdin.readline().split()))
M = int(input())
finds = list(map(int, sys.stdin.readline().split()))

dic = {}
for i in finds:
    dic[i] = 0

for i in cards:
    if i in dic:
        dic[i] = 1

for i in dic:
        print(dic[i], end=' ')
