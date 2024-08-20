N = int(input())
M = int(input())
prime = list(range(N, M+1))

for num in range(N, M+1):
    if num == 1:
        prime.remove(num)
    for i in range(2, num//2 + 1):
        if num % i == 0:
            prime.remove(num)
            break

if prime:
    print(sum(prime))
    print(min(prime))
else:
    print(-1)