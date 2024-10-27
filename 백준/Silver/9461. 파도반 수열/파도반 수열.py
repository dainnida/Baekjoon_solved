import sys
input = sys.stdin.readline

T = int(input())
triangle = [0, 1, 1, 1, 2, 2, 3, 4, 5]

for i in range(9, 101):
    triangle.append(triangle[i-5] + triangle[i-1])

for _ in range(T):
    N = int(input())
    print(triangle[N])