def solution(n,a,b):
    answer = 0

    if abs(a-b) == 0:
        return 1
    
    while abs(a-b):
        answer += 1
        a = (a+1) // 2
        b = (b+1) // 2

    return answer