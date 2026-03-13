def solution(n, left, right):
    answer = []
    # arr = [[0]*n for _ in range(n)]
    # for i in range(n, 0, -1):
    #     for j in range(0, i):
    #         for k in range(0, i):
    #             arr[j][k] = i
    for i in range(left, right+1):
        answer.append(max(i//n, i%n) + 1)
    return answer