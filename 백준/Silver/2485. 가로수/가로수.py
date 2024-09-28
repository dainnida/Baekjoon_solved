import sys, math

N = int(sys.stdin.readline())
gap = {}
result = 0

b = int(sys.stdin.readline())
for i in range(N-1):
    a = b
    b = int(sys.stdin.readline())
    gap[i] = b-a

gcd = gap[0]
for i in range(1, len(gap)):
    gcd = math.gcd(gcd, gap[i])

for i in gap:
    result += gap[i] // gcd - 1

print(result)