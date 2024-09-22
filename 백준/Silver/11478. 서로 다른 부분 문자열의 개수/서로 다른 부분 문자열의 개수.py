S = input()
result = 0

for i in range(1, len(S)+1): # 원소 개수
    s = set()
    j = 0
    while j+i <= len(S):
        s.add(S[j:j+i])
        j += 1
    result += len(s)

print(result)