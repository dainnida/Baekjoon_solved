def solution(s):
    lst = list(map(int, s.split(" ")))
    print(lst)
    answer = str(min(lst)) + ' ' + str(max(lst))
    return answer