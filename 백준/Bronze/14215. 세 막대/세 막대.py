a, b, c = sorted(map(int, input().split()))

if c < a + b:
    print(a+b+c)
else:
    print((a+b)*2 - 1)