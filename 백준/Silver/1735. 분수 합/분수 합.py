import sys, math

a1, b1 = map(int, sys.stdin.readline().split())
a2, b2 = map(int, sys.stdin.readline().split())

a = a1*b2 + a2*b1
b = b1*b2
while math.gcd(a, b) != 1:
    n = math.gcd(a, b)
    a = a//n
    b = b//n

print(a, b, sep=' ')