import sys, itertools
input = sys.stdin.readline

N, M = map(int, input().split())
lst = [i+1 for i in range(N)]

nCr = itertools.combinations(lst, M)
for i in nCr:
    print(*i)