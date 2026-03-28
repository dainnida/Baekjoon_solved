def solution(numbers):
    answer = [-1] * len(numbers)
    stack = [] # 뒷수를 찾지 못한 인덱스 담기
    
    for i in range(len(numbers)):
        while stack and numbers[stack[-1]] < numbers[i]:
            idx = stack.pop()
            answer[idx] = numbers[i]
        stack.append(i)
            
    return answer