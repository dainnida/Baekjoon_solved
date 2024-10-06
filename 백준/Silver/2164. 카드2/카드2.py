import sys, math
input = sys.stdin.readline

N = int(input())
num = int(math.log2(N))

result = 2*(N-(2**num))
if result == 0:
    print(N)
else:
    print(result)
