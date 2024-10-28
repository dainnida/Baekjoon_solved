import sys
from math import factorial
input = sys.stdin.readline

N = int(input())
tile = [0, 1, 2]

for i in range(3, N+1):
    tile.append((tile[i-2] + tile[i-1]) % 15746)

print(tile[N])