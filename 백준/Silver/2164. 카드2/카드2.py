import sys, math
input = sys.stdin.readline

N = int(input())
num = int(math.log2(N))

if N%(2**num) == 0:
    print(2**num)
else:
    print(2*(N%(2**num)))
