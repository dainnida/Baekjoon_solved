def solution(name):
    answer = 0
    left_right = len(name) - 1
    for idx, n in enumerate(name):
        answer += min(ord(n)-ord('A'), ord('Z')-ord(n)+1) # 위 vs 아래
        
        finA = idx + 1
        while finA < len(name) and name[finA] == 'A':
            finA += 1
        
        # 오른쪽만 vs
        # A 시작 지점까지 오른쪽으로 가서 바꾸고 왼쪽으로 A 끝나는 지점까지 이동 = 오른쪽으로 가다가 유턴해서 맨 뒤로 vs
        # A 끝나는 지점까지 왼쪽으로 가서 바꾸고 오른쪽으로 A 시작 지점까지 이동 = 처음부터 맨 뒤로 갔다가 다시 원점으로
        left_right = min(left_right, idx*2 + len(name)-finA, (len(name)-finA)*2 + idx)
        
    return answer + left_right