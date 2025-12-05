from collections import deque

def solution(priorities, location):
    queue = deque((value, i) for i, value in enumerate(priorities))
    answer = 0
    
    while queue:
        # maxTuple = max(queue, key = lambda x: x[0])
        process = queue.popleft()
        if queue and process[0] < max(queue)[0]:
            queue.append(process)
        else:
            answer += 1
            if process[1] == location:
                break
            
    return answer