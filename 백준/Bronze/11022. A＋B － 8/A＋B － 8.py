T = int(input())

for i in range(1, T+1):
    A, B = map(int, input().split())
    print("Case #", i, ":", sep="", end=" ")
    print(A, "+", B, "=", A+B)