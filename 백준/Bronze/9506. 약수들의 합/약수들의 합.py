n = int(input())

while n != -1:
    aliquot = []
    for i in range(1, n//2 + 1):
        if n % i == 0:
            aliquot.append(i)

    if sum(aliquot) == n:
        # print(n, "=", end=' ')
        # print(*aliquot, sep=' + ')
        # print(n, "=", " + ".join(map(str, aliquot)))
        print(n, "=", " + ".join(str(i) for i in aliquot))
    else:
        print(n, "is NOT perfect.")

    n = int(input())
