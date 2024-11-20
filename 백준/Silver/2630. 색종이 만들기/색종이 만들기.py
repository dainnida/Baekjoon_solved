import sys
input = sys.stdin.readline

N = int(input())
paper = [list(map(int, input().split())) for _ in range(N)]
res = []

def div(x, y, N):
    fst = paper[x][y]
    for i in range(x, x+N):
        for j in range(y, y+N):
            if fst != paper[i][j]:
                div(x, y, N//2)
                div(x, y + N//2, N//2)
                div(x + N//2, y, N//2)
                div(x + N//2, y + N//2, N//2)
                return
    if fst == 0:
        res.append(0)
    else:
        res.append(1)

div(0, 0, N)
print(res.count(0))
print(res.count(1))