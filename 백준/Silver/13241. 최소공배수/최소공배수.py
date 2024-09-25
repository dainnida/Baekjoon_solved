import sys

def gcd(a, b): # 유클리드 호제법
    while b>0:
        a, b = b, a%b
    return a

A, B = map(int, sys.stdin.readline().split())

print(A*B//gcd(A,B))