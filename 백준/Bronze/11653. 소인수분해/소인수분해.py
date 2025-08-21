import math

N = int(input())

if N != 1:
    i = 2
    while i <= math.isqrt(N):
        while N % i == 0:
            print(i)
            N //= i
        i += 1
    if N > 1:
        print(N)