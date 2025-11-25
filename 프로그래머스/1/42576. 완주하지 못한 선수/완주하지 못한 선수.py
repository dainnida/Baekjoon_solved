def solution(participant, completion):
    dict = {}
    answer = ''
    for p in participant:
        if p in dict:
            dict[p] += 1
        else:
            dict[p] = 1
    for c in completion:
        if dict[c] > 1:
            dict[c] -= 1
        else:
            dict.pop(c)
    return list(dict.keys())[0]