def solution(n):
    answer = n+1
    target = format(n, 'b').count('1')
    while(format(answer, 'b').count('1') != target):
        answer += 1
    
    return answer