import sys
input = sys.stdin.readline

N = int(input())
# cnt1 = 0
cnt2 = 0

# 피보나치 수 재귀 호출
# def fib(n):
#     global cnt1
#     if n==1 or n==2:
#         cnt1 += 1
#         return 1
#     else:
#         return fib(n-1) + fib(n-2)


# 피보나치 수 동적 프로그래밍
def fibonacci(n):
    global cnt2
    f2 = [0, 1, 1]
    for i in range(3, n+1):
        cnt2 += 1
        f2.append(f2[i-1] + f2[i-2])
    return f2[n]

print(fibonacci(N), cnt2)