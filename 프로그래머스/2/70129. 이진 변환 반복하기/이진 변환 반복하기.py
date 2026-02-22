def solution(s):
    answer = [0, 0]
    cnt = 0
    while s != "1":
        cnt += 1
        answer[1] += s.count('0')
        c = s.replace('0', '')
        s = format(len(c), 'b')
    answer[0] = cnt
                   
    return answer