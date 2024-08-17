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