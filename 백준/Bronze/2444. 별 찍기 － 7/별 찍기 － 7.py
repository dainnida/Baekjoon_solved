num = int(input())

for i in range(1, 2*num):
    if i<=num:
        print(" "*(num-i) + "*"*(2*i-1))
    else:
        print(" "*(i-num) + "*"*(2*(2*num-i)-1))