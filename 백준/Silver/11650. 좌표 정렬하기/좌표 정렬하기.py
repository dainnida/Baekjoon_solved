N = int(input())
coordinate = []

for i in range(N):
    coordinate.append(list(map(int, input().split())))

coordinate = sorted(coordinate, key=lambda x: (x[0], x[1]))
for i in range(N):
    print(*coordinate[i], sep=' ')