N = int(input())
# max = -1000001
# min = 1000001
arr = list(map(int, input().split()))

# for i in arr:
#     if i>max:
#         max=i
#     if i<min:
#         min=i
# print(min, max)

print(min(arr), max(arr))