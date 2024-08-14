num = int(input())
quarter = 25
dime = 10
nickel = 5
penny = 1

for _ in range(num):
    price = int(input())
    
    print(price // quarter, end=' ')
    price %= quarter
    print(price // dime, end= ' ')
    price %= dime
    print(price // nickel, end=' ')
    price %= nickel
    print(price // penny)
    price %= penny