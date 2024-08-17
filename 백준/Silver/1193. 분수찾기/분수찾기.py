# 방법1
num = int(input())
i = 1
sum = 1

while num > sum:
    i += 1
    sum += i

j = i
while num != sum:
    sum -= 1
    j -= 1

if i % 2 == 0:
    print(j, '/', i+1-j, sep='')
else:
    print(i+1-j, '/', j, sep='')
num = int(input())
i = 0

# 방법 2: 1에서 두 번째 while문 없애기
num = int(input())
i = 1
sum = 1

while num > sum:
    i += 1
    sum += i

j = sum - num + 1
if i % 2 != 0:
    print(j, '/', i+1-j, sep='')
else:
    print(i+1-j, '/', j, sep='')

# 방법 3: 2에서 sum까지 없애기
while num > 0:
    i += 1
    num -= i

j = - num + 1
if i % 2 != 0:
    print(j, '/', i+1-j, sep='')
else:
    print(i+1-j, '/', j, sep='')
