from collections import defaultdict
import math

def solution(fees, records):
    answer = []
    datas = defaultdict(list)   
    accum = defaultdict(int) 
    
    for record in records:
        time, number, action = record.split(" ")
        hour, minute = map(int, time.split(":"))
        minutes = 60*hour + minute
        
        datas[number].append(minutes)
    
    for number, stack in datas.items():
        if len(stack) % 2 != 0:
            m = stack.pop()
            accum[number] = 60*23+59 - m
        while stack:
            m2 = stack.pop()
            m1 = stack.pop()
            accum[number] += m2 - m1            
    accum = dict(sorted(accum.items()))
    
    for a in accum.values():
        if a > fees[0]:
            answer.append(fees[1] + math.ceil((a - fees[0]) / fees[2]) * fees[3])
        else:
            answer.append(fees[1])
    return answer