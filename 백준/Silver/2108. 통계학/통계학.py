import sys
input = sys.stdin.readline

N = int(input())
lst = []
dic = dict()

for _ in range(N):
    n = int(input())
    lst.append(n)
    if n in dic:
        dic[n] += 1
    else:
        dic[n] = 1

# 산술값
print(round(sum(lst)/N))

# 중앙값
lst.sort()
print(lst[N//2]) # 인덱스는 0부터

# 최빈값
dic = dict(sorted(dic.items()))

count = max(dic.values())
numbers = []
for key, value in dic.items():
    if value == count:
        numbers.append(key)

if len(numbers) == 1:
    print(numbers[0])
else:
    print(sorted(numbers)[1])

# 범위
print(lst[-1]-lst[0])