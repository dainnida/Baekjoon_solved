from collections import defaultdict
import math

def solution(fees, records):
    answer = []
    in_time = {}
    accum = defaultdict(int) 
    
    for record in records:
        time, number, action = record.split(" ")
        hour, minute = map(int, time.split(":"))
        minutes = 60*hour + minute
        
        if action == "IN":
            in_time[number] = minutes
        else:
            accum[number] += minutes - in_time.pop(number)
    
    # 아직 출차하지 않은 차들
    for number, minutes in in_time.items():
        accum[number] += 60*23+59 - minutes
    
    for number in sorted(accum.keys()):
        minutes = accum[number]
        if minutes > fees[0]:
            answer.add(fees[1] + math.ceil((minutes - fees[0]) / fees[2]) * fees[3])
        else:
            answer.add(fees[1])
    return answer