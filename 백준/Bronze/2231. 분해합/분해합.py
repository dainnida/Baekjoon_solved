N = int(input())
result = 0

for i in range(1, N):
    num = sum(map(int, str(i)))
    num += i
    if num == N:
        result = i
        break

print(result)
