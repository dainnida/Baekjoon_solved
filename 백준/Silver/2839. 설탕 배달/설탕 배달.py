N = int(input())
max5 = N//5
count = -1

for i in range(max5, -1, -1):
    rest = N - i*5
    if rest % 3 == 0:
        count = i + rest//3
        break

print(count)