from collections import deque

def solution(x, y, n):
    visited = set()
    q = deque([(x, 0)])
    visited.add(x)
    
    while q:
        curr, count = q.popleft()
        if curr == y:
            return count
        for node in [curr+n, curr*2, curr*3]:
            if node == y:
                return count+1
            elif node <= y and node not in visited:
                visited.add(node)
                q.append((node, count+1))

    return -1