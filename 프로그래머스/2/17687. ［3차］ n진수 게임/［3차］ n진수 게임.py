def change(n, q):
    result = ''
    if n == 0:
        return '0'
    while (n != 0):
        if (n%q) >= 10:
            result += chr(ord('A') + (n%q) -10)
        else:
            result += str(n % q)
        n //= q
    return result[::-1]

def solution(n, t, m, p):
    answer = ''
    count = 0 # n진수로 바꾸어야 할 수
    total = 1 # n진수로 바꾼 길이의 총 합
    while len(answer) <= t:
        strN = change(count, n)
        for idx, ch in enumerate(strN):
            if (total+idx) % m == p % m: # m=p일 때를 위해
                answer += ch
        total += len(strN)
        count += 1
    return answer[:t]