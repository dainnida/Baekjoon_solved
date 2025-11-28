from itertools import permutations

def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num**1/2)+1):
        if num % i == 0:
            return False
    return True
    
def solution(numbers):
    answer = 0
    papers = list(numbers)
    made = set()
    
    for i in range(1, len(papers)+1):
        for perm in permutations(papers, i):
            tmp= int(''.join(perm))
            made.add(tmp)

    for num in made:
        if is_prime(num):
            answer += 1
    return answer