N = int(input())
arr = list(map(int, input().split()))
    
print(sum(arr) / N / max(arr) * 100)