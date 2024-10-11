import sys
from itertools import combinations
input = sys.stdin.readline

N, K = map(int, input().split())

n = [i+1 for i in range(N)]
print(len(list(combinations(n, K))))
