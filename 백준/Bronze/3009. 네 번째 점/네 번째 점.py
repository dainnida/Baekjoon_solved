point_a = []
point_b = []

for _ in range(3):
    a, b = map(int, input().split())
    if a not in point_a:
        point_a.append(a)
    else:
        point_a.remove(a)

    if b not in point_b:
        point_b.append(b)
    else:
        point_b.remove(b)

print(*point_a, *point_b)