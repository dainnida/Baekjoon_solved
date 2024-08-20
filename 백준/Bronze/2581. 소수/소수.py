N = int(input())
M = int(input())
prime = []

for num in range(N, M+1):
    is_prime = True
    if num > 1:
        for i in range(2, num//2 + 1):
            if num % i == 0:
                is_prime = False
                break
        if is_prime == True:
            prime.append(num)

if prime:
    print(sum(prime))
    print(min(prime))
else:
    print(-1)