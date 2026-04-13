def solution(record):
    answer = []
    name = {}
    
    for r in record:
        r = r.split()
        action, uid = r[0], r[1]
        if action in ["Enter", "Change"]:
            name[uid] = r[2]
            
    for r in record:
        r = r.split()
        action, uid = r[0], r[1]
        if action == "Enter":
            answer.append(f"{name[uid]}님이 들어왔습니다.")
        elif action == "Leave":
            answer.append(f"{name[uid]}님이 나갔습니다.")
        
    return answer