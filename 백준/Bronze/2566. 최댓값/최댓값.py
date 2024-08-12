max = -1
row = 0
column = 0

for i in range(9):
    lst = list(map(int, input().split()))
    for j in range(9):
        if lst[j] > max:
            max = lst[j]
            row = i
            column = j

print(max)
print(row+1, column+1)