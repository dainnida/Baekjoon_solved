import sys
input = sys.stdin.readline

N, M = map(int, input().split())
lst = []

def backtracking(i=1):
    if len(lst) == M:
        print(*lst)
        return
    
    for j in range(i, N+1):
        lst.append(j)
        backtracking(j)
        lst.pop()

backtracking()