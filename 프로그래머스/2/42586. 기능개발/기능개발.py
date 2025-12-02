def solution(progresses, speeds):
    answer = []
    i = 0
    while i < len(progresses):
        days =  (100 - progresses[i] + speeds[i] - 1) // speeds[i]
        cnt = 1
        while (i+1 < len(progresses) and progresses[i+1] + speeds[i+1]* days >= 100):
            i += 1
            cnt += 1
        i+=1
        answer.append(cnt)
    return answer