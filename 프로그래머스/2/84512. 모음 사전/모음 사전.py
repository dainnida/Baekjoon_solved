# from collections import deque

def solution(word):
    answer = 0
#     dic = {'A': 0, 'E': 1, 'I': 2, 'O': 3, 'U': 4}
#     cnt = deque([1])
#     for i in range(1, 5):
#         cnt.appendleft(5*cnt[0]+1)
#     cnt = list(cnt)
    
#     for idx, w in enumerate(word):
#         answer += dic[w] * cnt[idx] + 1
    dic = []
    found = False
    
    def make(tmp):
        nonlocal found
        
        if tmp ==  word:
            found = True
            return
        if len(tmp) > 5:
            return
        if tmp:
            dic.append(tmp)
        for i in "AEIOU":
            if found == True:
                break
            make(tmp+i)
            
    make("")
    return len(dic)+1