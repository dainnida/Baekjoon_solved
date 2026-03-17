from collections import deque

def solution(cacheSize, cities):
    answer = 0
    queue = deque(maxlen = cacheSize)
    if cacheSize == 0:
        return 5*len(cities)
    
    for city in cities:
        city = city.lower()
        if city not in queue:
            # if len(queue) == cacheSize: # 캐시에 없는데 캐시 꽉 참
            #     queue.popleft()
            queue.append(city) # 캐시에 없지만 캐시 비어 있음
            answer += 5
        else: # 캐시에 있음 -> cache hit
            queue.remove(city)
            queue.append(city)
            answer += 1
    return answer