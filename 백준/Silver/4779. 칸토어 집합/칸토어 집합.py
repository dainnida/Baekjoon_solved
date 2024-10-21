import sys

def cantor(n):
    if n==0:
        return '-'
    else:
        return cantor(n-1) + ' '*(3**(n-1)) + cantor(n-1)
    
lines = sys.stdin.readlines()
for N in lines:
    print(cantor(int(N)))