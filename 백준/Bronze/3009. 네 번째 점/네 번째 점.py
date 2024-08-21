point_a = []
point_b = []

for _ in range(3):
    a, b = map(int, input().split())
    point_a.append(a)
    point_b.append(b)

for i in range(3):
    if point_a.count(point_a[i]) == 1:
        x = point_a[i]
    if point_b.count(point_b[i]) == 1:
        y = point_b[i]

print(x, y)