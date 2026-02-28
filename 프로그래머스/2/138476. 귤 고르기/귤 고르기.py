from collections import Counter

def solution(k, tangerine):
    answer = 0
    # dict = {}
    # for t in tangerine:
    #     dict[t] = dict.get(t, 0) + 1
    counts = Counter(tangerine)
    cnt = sorted(counts.values(), reverse = True) # 개수만 담겨 있는 리스트
    
    for i in cnt:
        if k <= 0:
            break
        k -= i
        answer += 1
    return answer