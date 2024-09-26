import sys

N = int(sys.stdin.readline())
X = list(map(int, sys.stdin.readline().split()))
S = sorted(set(X))
dic = {S[i]:i for i in range(len(S))}

for x in X:
    print(dic[x], end=' ')