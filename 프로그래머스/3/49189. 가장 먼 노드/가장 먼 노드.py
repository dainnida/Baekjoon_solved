from collections import deque

def solution(n, edge):
    graph = [[] for _ in range(n+1)]
    for a, b in edge:
        graph[a].append(b)
        graph[b].append(a)
        
    dp = [-1] * (n+1) # 1노드부터 n노드까지 거리
    dp[1] = 0
    
    q = deque([1])
    
    while q:
        now = q.popleft()
        for nxt in graph[now]:
            if dp[nxt] == -1:
                dp[nxt] = dp[now]+1
                q.append(nxt)
                
    max_dp = max(dp)
    return dp.count(max_dp)