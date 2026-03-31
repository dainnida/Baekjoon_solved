def solution(arr):
    answer = 0
    
    for num in arr:
        count = 0
        while(1):
            if num >= 50 and num % 2 == 0:
                num /= 2
                count += 1
                answer = max(answer, count)
            elif num < 50 and num % 2 != 0:
                num = 2*num + 1
                count += 1
                answer = max(answer, count)
            else:
                break
                
    return answer