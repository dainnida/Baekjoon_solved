def solution(sequence, k):
    answer = []
    start, end = 0, 0
    total = 0
    
    for end in range(len(sequence)):
        total += sequence[end]
        
        while total > k:
            total -= sequence[start]
            start += 1
    
        if total == k:
            answer.append([start, end])
    
    answer.sort(key = lambda x : (x[1] - x[0], x[0]))
    return answer[0]