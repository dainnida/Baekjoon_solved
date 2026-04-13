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
            answer.append("{}님이 들어왔습니다.".format(name[uid]))
        elif action == "Leave":
            answer.append("{}님이 나갔습니다.".format(name[uid]))
        
    return answer