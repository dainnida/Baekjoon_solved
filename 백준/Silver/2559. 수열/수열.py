import sys
input = sys.stdin.readline

N, K = map(int, input().split())
temp = list(map(int, input().split()))
seq = [sum(temp[:K])]

for i in range(K, N):
    seq.append(seq[i-K] - temp[i-K] + temp[i])

print(max(seq))
