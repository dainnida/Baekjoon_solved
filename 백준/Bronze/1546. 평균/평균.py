N = int(input())
arr = list(map(int, input().split()))
max = 0
sum = 0

for i in range(N):
    sum += arr[i]
    if arr[i] > max:
        max = arr[i]
    
print(sum / N / max * 100)