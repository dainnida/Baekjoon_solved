def solution(skill, skill_trees):
    answer = 0
    for tree in skill_trees:
        filtered_skill = [s for s in tree if s in skill]
        if "".join(filtered_skill) == skill[:len(filtered_skill)]:
        # 앞을 배워야 뒤를 배울 수 있기 때문에 반드시 맨 처음부터 포함되어야 함
            answer += 1
            
    return answer