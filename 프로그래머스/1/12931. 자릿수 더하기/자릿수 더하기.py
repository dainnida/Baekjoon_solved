def solution(n):
    answer = 0

    lenN= len(str(n))
    for i in range(lenN, 0, -1):
        answer += n // (10**(i-1))
        n %= (10**(i-1))
    return answer