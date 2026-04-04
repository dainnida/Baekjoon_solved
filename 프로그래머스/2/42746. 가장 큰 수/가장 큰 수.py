def solution(numbers):
    numbers = list(map(str, numbers))
    numbers.sort(key = lambda x : x*3, reverse = True)
    
    return str(int(''.join(numbers))) # [0,0] 이라면 답이 "00"이 아닌 "0"어야 함