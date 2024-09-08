import sys

N = int(input())
num = []

for _ in range(N):
    num.append(int(sys.stdin.readline()))

print(*sorted(num), sep='\n')