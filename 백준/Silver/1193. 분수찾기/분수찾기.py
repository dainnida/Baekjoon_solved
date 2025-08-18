num = int(input())
i = 0

while num > 0:
    i += 1
    num -= i

j = - num + 1
if i % 2 != 0:
    print(j, '/', i+1-j, sep='')
else:
    print(i+1-j, '/', j, sep='')