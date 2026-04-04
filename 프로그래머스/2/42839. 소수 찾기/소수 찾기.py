from itertools import permutations
import math

def is_prime(n):
    if n == 0 or n == 1:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if (n % i == 0):
            return False
    return True

def solution(numbers):
    answer = []
    papers = []
    for i in range(1, len(numbers)+1):
        papers += list(permutations(list(numbers), i))
    
    for paper in papers:
        paper = int(''.join(paper))
        if is_prime(paper):
            answer.append(paper)
    
    answer = list(set(answer))
    return len(answer)