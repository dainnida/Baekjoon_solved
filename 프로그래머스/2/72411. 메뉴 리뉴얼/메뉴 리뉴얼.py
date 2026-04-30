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
        if(combi_dic):
            max_value = max(combi_dic.values())
            if max_value >= 2:
                for key, value in combi_dic.items():
                    if value == max_value:
                        answer.append(key)
        
    return sorted(answer)