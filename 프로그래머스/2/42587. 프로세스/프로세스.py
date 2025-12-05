from collections import deque

def solution(priorities, location):
    queue = deque((value, i) for i, value in enumerate(priorities))
    answer = []
    
    while queue:
        maxTuple = max(queue, key = lambda x: x[0])
        process = queue.popleft()
        if process[0] < maxTuple[0]:
            queue.append(process)
        else:
            answer.append(process[1])
            
    return answer.index(location)+1