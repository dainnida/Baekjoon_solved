import sys
input = sys.stdin.readline

N, K = map(int, input().split())
temp = list(map(int, input().split()))
seq = [0] # temp의 0인덱스부터 n인덱스까지의 합을 n+1인덱스에 저장

for i in range(1, N+1):
    seq.append(seq[i-1]+temp[i-1]) # temp는 인덱스 0부터 저장됨

res = seq[K]

for i in range(K, N+1):
    tmp = seq[i]-seq[i-K]
    res = max(tmp, res)
print(res)
