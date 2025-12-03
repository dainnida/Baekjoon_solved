def solution(s):
    if s[0] == ')' or s[-1] == '(':
        return False
    s = list(s)
    cnt = 0
    for ch in s:
        if ch == '(':
            cnt += 1
        else:
            cnt -= 1
            if cnt < 0:
                return False
    return cnt == 0