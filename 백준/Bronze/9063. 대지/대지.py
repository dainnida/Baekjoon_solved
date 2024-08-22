N = int(input())
point_x = []
point_y = []

for _ in range(N):
    x, y = map(int, input().split())
    point_x.append(x)
    point_y.append(y)

print((max(point_x)-min(point_x))*(max(point_y)-min(point_y)))