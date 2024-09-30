import sys, math

def isPrime(num):
    for i in range(2, int(num**(1/2))+1): # math.sqrt(n)
        if num % i == 0:
            return False
    return True

prime = []
for i in range(2, 123456*2+1):
    if isPrime(i):
        prime.append(i)

n = int(sys.stdin.readline())
while n != 0:
    cnt = 0
    for i in prime:
        if n < i <= 2*n:
            cnt += 1
    print(cnt)
    n = int(sys.stdin.readline())