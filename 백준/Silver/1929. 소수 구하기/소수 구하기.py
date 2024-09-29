import sys, math

def isPrime(num):
    if num == 0 or num == 1:
        return False
    for i in range(2, int(num**(1/2))+1): # math.sqrt(n)
        if num % i == 0:
            return False
    return True

M, N = map(int,sys.stdin.readline().split())

for i in range(M, N+1):
    if isPrime(i):
        print(i)