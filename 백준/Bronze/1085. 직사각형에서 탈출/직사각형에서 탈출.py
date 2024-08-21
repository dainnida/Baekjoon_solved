x, y, w, h = map(int, input().split())

min_width = min(x, w-x)
min_column = min(y, h-y)
print(min(min_width, min_column))