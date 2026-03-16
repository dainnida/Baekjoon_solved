answer = 0
visited = []

def backtrack(k, dungeons, cnt):
    global answer
    answer = max(answer, cnt)
    
    for i in range(len(dungeons)):
        if not visited[i] and k>=dungeons[i][0]:
            visited[i] = True
            backtrack(k-dungeons[i][1], dungeons, cnt+1)
            visited[i] = False

def solution(k, dungeons):
    global visited
    visited = [False] * len(dungeons)
    backtrack(k, dungeons, 0)
    return answer