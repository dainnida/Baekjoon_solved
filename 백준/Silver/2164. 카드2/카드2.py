import sys
input = sys.stdin.readline

N = int(input())
temp = N
num = 0
while temp != 1:
    num += 1
    temp //= 2

if N%(2**num) == 0:
    print(2**num)
else:
    print(2*(N%(2**num)))