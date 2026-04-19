def solution(n):
    answer = ''
    num = ['4', '1', '2'] # 3진법의 0 -> 124수의 4, 1 -> 1, 2 - > 2
    
    while n > 0:
        n, rest = n // 3, n % 3
        answer = num[rest] + answer
        if rest == 0:
            n -= 1
            
    return answer