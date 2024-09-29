import sys, math

def isPrime(num):
    if num == 0 or num == 1:
        return False
    for i in range(2, int(num**(1/2))+1): # math.sqrt(n)
        if num % i == 0:
            return False
    return True

n = int(sys.stdin.readline())

for _ in range(n):
    num = int(sys.stdin.readline())
    while True:
        if isPrime(num):
            print(num)
            break
        else:
            num += 1