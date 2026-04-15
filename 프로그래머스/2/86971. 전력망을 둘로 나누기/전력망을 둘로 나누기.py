from collections import defaultdict, deque

def solution(n, wires):
    answer = n
    graph = defaultdict(list)
    for a, b in wires:
        graph[a].append(b)
        graph[b].append(a)
    
    for a, b in wires:
        q = deque([a])
        visited = {a}
        count = 1 # 노드 개수
        while q:
            curr = q.popleft()
            for neighbor in graph[curr]:
                if neighbor not in visited and neighbor != b:
                    visited.add(neighbor)
                    q.append(neighbor)
                    count += 1
        if abs(count-(n-count)) < answer:
            answer = abs(count-(n-count))
                    
    return answer