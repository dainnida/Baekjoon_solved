N = int(input())
arr = list(map(int, input().split()))
new_arr = []
max = max(arr)

for i in range(N):
    new_arr.append(arr[i] / max * 100)
    
print(sum(new_arr) / N)
