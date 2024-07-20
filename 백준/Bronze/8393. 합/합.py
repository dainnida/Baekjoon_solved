n = int(input())
# print(int(n*(n+1)/2))
result = 0

for i in range(1, n+1):
    result += i
print(result)