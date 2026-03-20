from collections import Counter

def solution(topping):
    answer = 0
    set_right = Counter(topping)
    set_left = set()
    count_right = len(set_right)
    
    for t in topping:
        set_right[t] -= 1
        if (set_right[t] == 0):
            count_right -= 1
        set_left.add(t)
        
        if count_right == len(set_left):
            answer += 1
        
    return answer