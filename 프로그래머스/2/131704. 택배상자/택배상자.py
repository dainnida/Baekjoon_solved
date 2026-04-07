from collections import deque

def solution(order):
    answer = 0
#    order = deque(order)
    assis = []
    
#     for box in range(1, len(order)+1):
#         if box == order[0]:
#             order.popleft()
#             answer += 1
#         else:
#             while(assis and order[0] == assis[-1]):
#                 order.popleft()
#                 assis.pop()
#                 answer += 1
#             assis.append(box)
    
#     for i in assis[::-1]:
#         if i == order[0]:
#             order.popleft()
#             answer += 1
#         else:
#             break

    for box in range(1, len(order)+1):
        assis.append(box)
        
        while assis and order[answer] == assis[-1]:
            answer += 1
            assis.pop()
            
    return answer