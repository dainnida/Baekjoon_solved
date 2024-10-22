import sys, math
input = sys.stdin.readline

def star(n):
    if n==3:
        init = ['***', '* *', '***']
        return init
    else:
        prev = star(n//3)
        lst = []
        for i in prev:
            lst.append(i*3)
        for i in prev:
            lst.append(i + ' '*(n//3) + i)
        for i in prev:
            lst.append(i*3)
        return lst
    
N = int(input())
print('\n'.join(star(N)))