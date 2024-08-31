N = int(input())
result = 1000001

for i in range(1, N):
    num = list(map(int, str(i)))
    sum = i
    for j in range(len(num)):
        sum += num[j]
    if sum == N:
        result = min(result, i)

if result == 1000001:
    print(0)
else:
    print(result)
