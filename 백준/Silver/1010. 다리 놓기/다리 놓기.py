import sys
from math import factorial
input = sys.stdin.readline

T = int(input())

# def factorial(n):
#     if n==0:
#         return 1
#     return n*factorial(n-1)

for _ in range(T):
    N, M = map(int, input().split())
    print(factorial(M) // (factorial(N)*factorial(M-N)))
