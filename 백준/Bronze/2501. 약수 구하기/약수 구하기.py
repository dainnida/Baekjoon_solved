N, K = map(int, input().split())
num = 0
count = 0

for i in range(1, N+1):
    if N % i == 0:
        count += 1
        if (count == K):
            num = i
            break
print(num)