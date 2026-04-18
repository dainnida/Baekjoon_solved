from collections import deque

def is_correct(w):
    stack = []
    w_q = deque(w)
    
    while w_q:
        curr = w_q.popleft()
        if curr == "(":
            stack.append(curr)
        else:
            if stack and stack[-1] == "(":
                stack.pop()
            else:
                break
        
    if not w_q and not stack: # 올바른 괄호 문자열
        return True
    return False

def balanced(w):
    right, left = 0, 0
    for idx, s in enumerate(w):
        if s == "(":
            right += 1
        else:
            left += 1
        if right == left:
            return w[:idx+1], w[idx+1:]

def solution(p):
    answer = ''
        
    if is_correct(p):
        return p
    
    u, v = balanced(p)
    if is_correct(u):
        return u + solution(v)
    
    answer += '(' + solution(v) + ')'
    for i in u[1:len(u)-1]:
        if i == '(':
            answer += ')'
        else:
            answer += '('
                
    return answer