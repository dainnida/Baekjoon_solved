hour, min = map(int, input().split())
time = int(input())

hour += time // 60
min += time % 60
        
# hour>23, min>=60: h-24, m-60, h+1
# hour>23, min<60: h-24
# h=<23, m>=60: m-60, h+1 (그런데 h=23이면 h=0이어야 함)
# h=<23, m>60: ㄱㅊ
if(min >=  60):
    min -= 60
    hour += 1
    
if (hour > 23):
    hour -= 24

print(hour, min)