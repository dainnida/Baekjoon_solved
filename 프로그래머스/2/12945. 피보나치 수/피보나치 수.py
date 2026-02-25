def fib(n):
    a, b = 0, 1
    for i in range(2, n+1):
        a, b = b, a+b
    return b

def solution(n):
    # fibo = [0, 1]
    # for i in range(2, n+1):
    #     fibo.append(fibo[i-1] + fibo[i-2])
    # return fibo[n] % 1234567
    return fib(n) % 1234567