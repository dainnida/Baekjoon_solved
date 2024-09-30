import sys

prime = {}
prime[1] = False
for i in range(2, 123456*2+1):
    prime[i] = True
    for j in range(2, int(i**(1/2))+1):
        if i % j == 0:
            prime[i] = False
            break

n = int(sys.stdin.readline())

while n != 0:
    cnt = 0
    for i in range(n+1, 2*n+1):
        if prime[i]:
            cnt += 1
    print(cnt)
    n = int(sys.stdin.readline())