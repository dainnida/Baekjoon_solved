import sys
input = sys.stdin.readline

N = int(input())
aliquot = list(map(int, input().split()))

print(max(aliquot)*min(aliquot))