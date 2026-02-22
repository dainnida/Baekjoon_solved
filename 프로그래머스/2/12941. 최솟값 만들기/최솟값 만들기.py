def solution(A,B):
    answer = 0
    A.sort(reverse=True)
    B.sort()

    for i in range(0, len(A)):
        answer += A[i] * B[i]
    return answer