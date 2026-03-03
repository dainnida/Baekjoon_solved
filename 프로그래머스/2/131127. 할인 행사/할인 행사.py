from collections import Counter

def solution(want, number, discount):
    answer = 0
    dic = {}
    for i in range(len(want)):
        dic[want[i]] = number[i]
        
    for i in range(len(discount)-9):
        # tmp = dic.copy()
        # for item in discount[i:i+10]:
        #     if item in want and tmp[item] > 0:
        #         tmp[item] -= 1
        # if all(v==0 for v in tmp.values()):
        #     answer += 1
        if dic == Counter(discount[i:i+10]):
            answer += 1
        
    return answer