def solution(s):
    answer = 0
    if len(s) % 2 != 0:
        return 0
    lngth = len(s)
    s = s + s
    for i in range(lngth):
        stack = []
        for j in range(i, i+lngth):
            if s[j] in "([{":
                stack.append(s[j])
            elif stack:
                if ( (stack[-1] == "(" and s[j] == ")")
                    or (stack[-1] == "[" and s[j] == "]")
                    or (stack[-1] == "{" and s[j] == "}") ):
                        stack.pop()
                else: # 스택이 비어있지 않은데 짝이 맞지 않음
                    stack.append(s[j])
                    break
            else: # 스택이 비어있는데 닫는 괄호가 들어옴
                stack.append(s[j])
                break
                
        if not stack:
            answer += 1
        
    return answer