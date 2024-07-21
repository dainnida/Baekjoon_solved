# max = 0
# index = 0

# for i in range(9):
#     num = int(input())
#     if num>max:
#         max=num
#         index = i+1

# print(max, index, sep="\n")

arr = []

for i in range(9):
    arr.append(int(input()))

print(max(arr))
print(arr.index(max(arr))+1)
