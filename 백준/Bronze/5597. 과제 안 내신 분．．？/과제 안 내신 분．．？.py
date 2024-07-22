arr = [0] * 30

for i in range(28):
    num = int(input())
    arr.append(num)

for i in range(1, 31):
    if i not in arr:
        print(i)
