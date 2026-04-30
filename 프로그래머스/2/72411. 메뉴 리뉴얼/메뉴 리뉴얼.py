from itertools import combinations
from collections import Counter

def solution(orders, course):
    answer = []
    
    for num in course:
        combi = []
        for order in orders:
            order_list = sorted(list(order))
            combi += list("".join(p) for p in combinations(order_list, num))
        combi_dic = dict(Counter(combi))
        # key 기준 내림차순
        combi_dic = dict(sorted(combi_dic.items(), key = lambda x : -x[1]))
        if(combi_dic):
            max_value = max(combi_dic.values())
            if max_value >= 2:
                for key, value in combi_dic.items():
                    if value == max_value:
                        answer.append(key)
                    if value < max_value:
                        break
        
    return sorted(answer)