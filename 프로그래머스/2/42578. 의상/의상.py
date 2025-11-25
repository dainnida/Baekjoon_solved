def solution(clothes):
    dict = {}
    for name, type in clothes:
        if type in dict.keys():
            # dict[type].append(name) # or dict[type] += [name]
            dict[type] += 1
        else:
            # dict[type] = [name]
            dict[type] = 1
    answer = 1
    for i in dict.values():
        answer *= i + 1
    return answer-1
            