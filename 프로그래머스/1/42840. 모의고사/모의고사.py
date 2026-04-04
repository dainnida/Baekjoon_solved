def solution(answers):
    correct = []
    cnt = [0, 0, 0]
    one, two, three = [1, 2, 3, 4, 5], [2, 1, 2, 3, 2, 4, 2, 5], [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    for idx, answer in enumerate(answers):
        if one[idx % 5] == answer:
            cnt[0] += 1
        if two[idx % 8] == answer:
            cnt[1] += 1
        if three[idx % 10] == answer:
            cnt[2] += 1
            
    maxN = max(cnt)
    for i in range(3):
        if maxN == cnt[i]:
            correct.append(i+1)
    return correct