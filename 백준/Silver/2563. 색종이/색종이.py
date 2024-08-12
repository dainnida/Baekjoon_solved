num = int(input())
area = [[False for _ in range(100)] for _ in range (100)]
sum = 0

for _ in range(num):
    x, y = map(int, input().split())
    for i in range(x, x+10):
        for j in range(y, y+10):
            if area[i][j] == False:
                area[i][j] = True
                sum += 1

print(sum)