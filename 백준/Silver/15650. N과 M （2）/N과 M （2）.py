import sys
input = sys.stdin.readline

N, M = map(int, input().split())
lst = []

def backtracking(i=1):
    if len(lst) == M:
        print(*lst)
        return
    
    for j in range(i, N+1):
        if j not in lst:
            lst.append(j)
            backtracking(j+1)
            lst.pop()

backtracking()
