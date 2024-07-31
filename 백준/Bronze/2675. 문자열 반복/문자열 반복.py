T = int(input())

for i in range(T):
    S, P = input().split()
    for j in P:
        print(j * int(S), end='')
    print()