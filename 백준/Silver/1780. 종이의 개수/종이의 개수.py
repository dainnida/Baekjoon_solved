import sys
input = sys.stdin.readline

N = int(input())
tree = [list(map(int, input().split())) for _ in range(N)]
res = []

def div(x, y, N):
    fst = tree[x][y]
    for i in range(x, x+N):
        for j in range(y, y+N):
            if fst != tree[i][j]:
                div(x, y, N//3)
                div(x, y + N//3, N//3)
                div(x, y + 2*N//3, N//3)
                div(x + N//3, y, N//3)
                div(x + 2*N//3, y, N//3)
                div(x + N//3, y + N//3, N//3)
                div(x + 2*N//3, y + N//3, N//3)
                div(x + N//3, y + 2*N//3, N//3)
                div(x + 2*N//3, y + 2*N//3, N//3)
                return
    if fst == 0:
        res.append(0)
    elif fst == 1:
        res.append(1)
    else:
        res.append(-1)

div(0, 0, N)
print(res.count(-1))
print(res.count(0))
print(res.count(1))