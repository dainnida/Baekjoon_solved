N = int(input())
count = N
nums = list(map(int, input().split()))

for num in nums:
    if num == 1:
        count -= 1
    for i in range(2, num//2 + 1):
        if num % i == 0:
            count -= 1
            break

print(count)