import sys
input = sys.stdin.readline

N = int(input())
DP = [0, 0, 1, 1] # 2,3은 미리 넣어놓기

if N>3:
    for i in range(4, N+1):
        if i%2==0 and i%3==0:
            DP.append(min(DP[i//2], DP[i//3], DP[i-1])+1)
        elif i%2==0:
            DP.append(min(DP[i//2], DP[i-1])+1)
        elif i%3==0:
            DP.append(min(DP[i//3], DP[i-1])+1)
        else:
            DP.append(DP[i-1]+1)

print(DP[N])