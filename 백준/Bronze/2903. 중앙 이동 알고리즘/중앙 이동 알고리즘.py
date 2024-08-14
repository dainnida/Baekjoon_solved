num = int(input())
a = 2

for _ in range(1, num+1):
    a += a-1
print(a**2)