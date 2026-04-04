def solution(answers):
    answer = []
    cnt = [0, 0, 0]
    one, two, three = [1, 2, 3, 4, 5], [2, 1, 2, 3, 2, 4, 2, 5], [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    for i in range(len(answers)):
        if one[i % 5] == answers[i]:
            cnt[0] += 1
        if two[i % 8] == answers[i]:
            cnt[1] += 1
        if three[i % 10] == answers[i]:
            cnt[2] += 1
            
    maxN = max(cnt)
    for i in range(3):
        if maxN == cnt[i]:
            answer.append(i+1)
    return answer