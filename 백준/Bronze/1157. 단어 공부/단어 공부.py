str = input()
str = str.upper()
count = [0 for i in range(26)]
max = -1
result = ''

for i in str:
    count[ord(i)-65] += 1

for i in range(26):
    if count[i] > max:
        max = count[i]
        result = chr(i+65)
    elif count[i] == max:
        result = '?'

print(result)