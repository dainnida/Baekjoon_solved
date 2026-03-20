from collections import Counter

def solution(topping):
    answer = 0
    right_set = Counter(topping)
    left_set = set()
    
    for t in topping:
        right_set[t] -= 1
        if (right_set[t] == 0):
            right_set.pop(t)
        left_set.add(t)
        
        if len(right_set) == len(left_set):
            answer += 1
        
    return answer