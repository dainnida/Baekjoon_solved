def solution(number, k): 
    answer = []
    
    for num in number:
        while k > 0 and answer and answer[-1] < num:
            answer.pop()
            k -= 1
        answer.append(num)
    
    return ''.join(answer[:len(answer)-k]) # 더 제거할 수가 남았다면 맨 뒤를 자름 이미 내림차순으로 잘 정렬되어 있기 때문