def solution(msg):
    dic = {}
    answer = []
    for i in range(26):
        dic[chr(ord('A')+i)] = i+1
        
    i = 0
    while(i<len(msg)):
        tmp = msg[i]
        for j in range(i+1, len(msg)):
            tmp += msg[j]
            if tmp not in dic:
                tmp = tmp[:-1]
                break
        
        answer.append(dic[tmp])
        i += len(tmp)
        if (i<len(msg)-1):
            dic[tmp+msg[i]] = next(reversed(dic.values())) + 1
    
    return answer