import sys

dic = {}
N = int(input())
nList = list(map(int, sys.stdin.readline().split()))

for n in nList:
    if dic.get(n) == None:
        dic[n] = 1
    else:
        dic[n] += 1

M = int(input())
mList = list(map(int, sys.stdin.readline().split()))

for m in mList:
    if dic.get(m) == None:
        print(0, end=' ')
    else:
        print(dic[m], end=' ')