import sys
input = sys.stdin.readline

N, M = map(int, input().split())
lst = []

def backtracking():
    if len(lst) == M:
        print(*lst)
        return
    
    for i in range(1, N+1):
        lst.append(i)
        backtracking()
        lst.pop()

backtracking()