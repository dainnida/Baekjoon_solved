import sys

N = int(input())
members = []

for _ in range(N):
    age, name = sys.stdin.readline().split()
    members.append([int(age), name])

members.sort(key = lambda x: x[0])

for i in range(N):
    print(*members[i], sep=' ')