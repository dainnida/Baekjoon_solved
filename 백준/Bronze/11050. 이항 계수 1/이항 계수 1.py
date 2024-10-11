import sys
input = sys.stdin.readline

N, K = map(int, input().split())
if K > N/2:
    K = N-K
result = 1

for i in range(1, K+1):
    result *= N
    result /= i
    N -= 1  

print(int(result))