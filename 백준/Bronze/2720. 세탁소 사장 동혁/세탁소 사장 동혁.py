num = int(input())

for _ in range(num):
    price = int(input())
    for i in [25, 10, 5, 1]:
        print(price // i, end=' ')
        price %= i
    print()