T = int(input())

for _ in range(T):
    A, B = map(int, input().split())
    if A>B:
        A, B = B, A
    for i in range(A, 0, -1):
        if A%i == 0 and B%i == 0:
            break

    print(A*B//i)