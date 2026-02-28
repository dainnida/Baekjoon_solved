def solution(k, tangerine):
    answer = 0
    dict = {}
    for t in tangerine:
        if t in dict:
            dict[t] += 1
        else:
            dict[t] = 1
    cnt = sorted(dict.values(), reverse = True) # 개수만 담겨 있는 리스트
    
    for i in cnt:
        if k <= 0:
            break
        k -= i
        answer += 1
    return answer