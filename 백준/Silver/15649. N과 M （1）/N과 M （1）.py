import sys, itertools
input = sys.stdin.readline

N, M = map(int, input().split())
lst = [i+1 for i in range(N)]

nPr = itertools.permutations(lst, M)
for i in nPr:
    print(*i)