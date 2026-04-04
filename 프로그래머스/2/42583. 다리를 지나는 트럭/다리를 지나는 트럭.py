from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    trucks = deque([0]*bridge_length, maxlen = bridge_length)
    truck_weights = deque(truck_weights)
    bridge_weight = 0
    
    while truck_weights: # 트럭 다 올리기
        nxt = truck_weights[0]
        out = trucks[-1]
        if nxt > weight:
            truck_weights.popleft()
            continue
        answer += 1
        if bridge_weight - out + nxt <= weight: # 올라갈 수 있음
            truck_weights.popleft() # 대기 트럭에서 빼고
            trucks.appendleft(nxt) # 다리 위에 올림
            bridge_weight = bridge_weight - out + nxt
        else:
            trucks.appendleft(0)
            bridge_weight -= out

    return answer + bridge_length