import sys

prime = [0]*2 + [1]*(123456*2+1)  #0부터 123456*2+1까지
for i in range(2, 123456*2+1): # 소수가 아닌 걸 거르기
    if prime[i]:
        for j in range(2*i, 123456*2+1, i):
            prime[j] = 0

n = int(sys.stdin.readline())
while n != 0:
    cnt = 0
    print(sum(prime[n+1:2*n+1]))
    n = int(sys.stdin.readline())