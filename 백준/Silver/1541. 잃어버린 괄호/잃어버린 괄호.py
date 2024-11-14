import sys
input = sys.stdin.readline

calc = input().split('-')

fst = map(int, calc[0].split('+'))
res = sum(fst)

for i in range(1, len(calc)):
    num = calc[i].split('+')
    tmp = 0
    for j in num:
        tmp += int(j)
    res -= tmp

print(res)