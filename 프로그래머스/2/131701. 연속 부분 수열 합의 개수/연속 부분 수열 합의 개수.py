from collections import deque

def solution(elements):
    answer = 0
    s = set(elements)
    circle = elements[:]
    for i in range(1, len(elements)+1):
        circle.append(elements[i-1])
        for j in range(len(circle)-i+1):
            s.add(sum(circle[j:j+i]))
    return len(s)