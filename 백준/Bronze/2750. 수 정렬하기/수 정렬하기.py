N = int(input())
num = []

for i in range(N):
    n = int(input())
    num.append(n)

num.sort()
print(*num, sep='\n')