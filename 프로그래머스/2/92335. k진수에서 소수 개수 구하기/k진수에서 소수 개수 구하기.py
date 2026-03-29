import math

def change(n, k):
    tmp = []
    while n > 0:
        tmp.append(str(n % k))
        n //= k
    return ''.join(reversed(tmp))

def isPrime(n):
    if n == 1:
        return False
    if n == 2:
        return True
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True

def solution(n, k):
    answer = 0
    n_changed = change(n, k)
    
    # lst = []
    # tmp = ""
    # for i in n_changed:
    #     if i == '0':
    #         if tmp:
    #             lst.append(tmp)
    #             tmp = ""
    #         lst.append(i)
    #     else:
    #         tmp += i
    # if tmp:
    #     lst.append(tmp)
    lst = n_changed.split('0')
    for p in lst:
        if p and isPrime(int(p)):
            answer += 1
        
    return answer