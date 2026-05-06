def solution(sequence, k):
    answer = [0, len(sequence)]
    start, end = 0, 0
    total = 0
    
    for end in range(len(sequence)):
        total += sequence[end]
        
        while total > k:
            total -= sequence[start]
            start += 1
    
        if total == k:
            if end - start < answer[1] - answer[0]:
                answer = [start, end]
    
    return answer