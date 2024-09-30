import sys, math

def isPrime(num):
    for i in range(2, int(num**(1/2))+1): # math.sqrt(n)
        if num % i == 0:
            return False
    return True

prime = [0]*(123456*2+2) #0부터 123456*2+1까지
for i in range(2, 123456*2+1):
    if isPrime(i):
        prime[i] = 1

n = int(sys.stdin.readline())
while n != 0:
    cnt = 0
    print(sum(prime[n+1:2*n+1]))
    n = int(sys.stdin.readline())