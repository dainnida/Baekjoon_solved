from collections import deque

def solution(order):
    answer = 0
    order = deque(order)
    main = deque([i for i in range(1, len(order)+1)])
    assis = []
    
    for box in main:
        if box == order[0]:
            order.popleft()
            answer += 1
        else:
            while(assis and order[0] == assis[-1]):
                order.popleft()
                assis.pop()
                answer += 1
            assis.append(box)
    
    for i in assis[::-1]:
        if i == order[0]:
            order.popleft()
            answer += 1
        else:
            break
            
    return answer