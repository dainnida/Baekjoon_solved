import sys

prime = [0]*2 + [1]*(1000000)
for i in range(2, 1000000): # 소수가 아닌 걸 거르기
    if prime[i]:
        for j in range(2*i, 1000000, i):
            prime[j] = 0

T = int(sys.stdin.readline())
for _ in range(T):
    N = int(sys.stdin.readline())
    cnt = 0
    for i in range(1, N//2+1):
        if prime[i] == 1 and prime[N-i] == 1:
                cnt += 1
    print(cnt)