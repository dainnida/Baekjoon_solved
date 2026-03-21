def solution(s):
    answer = []
    s = s[2:-2].split('},{')
    s.sort(key=len)
    answer.append(int(s[0]))
    for i in s:
        lst = list(map(int, i.split(',')))
        tmp = set(lst)-set(answer)
        if tmp:
            answer.append(tmp.pop())
    return answer