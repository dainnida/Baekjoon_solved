import sys
input = sys.stdin.readline

N = int(input())
tree = [list(map(int, input().strip())) for _ in range(N)]
res = []

def div(x, y, N):
    fst = tree[x][y]
    for i in range(x, x+N):
        for j in range(y, y+N):
            if fst != tree[i][j]:
                res.append('(')
                div(x, y, N//2)
                div(x, y + N//2, N//2)
                div(x + N//2, y, N//2)
                div(x + N//2, y + N//2, N//2)
                res.append(')')
                return
    if fst == 0:
        res.append(0)
    else:
        res.append(1)

div(0, 0, N)
print(*res, sep='')