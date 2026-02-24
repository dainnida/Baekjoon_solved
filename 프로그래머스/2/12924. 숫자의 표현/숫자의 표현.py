import math

def solution(n):
    answer = 1
    for i in range(1, math.ceil(n/2)):
        tmp = 0
        while tmp < n:
            tmp += i
            i += 1
        if tmp == n:
            answer += 1
    return answer