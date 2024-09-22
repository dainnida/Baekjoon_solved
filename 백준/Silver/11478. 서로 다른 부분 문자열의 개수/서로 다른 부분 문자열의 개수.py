S = input()
result = 0

for i in range(1, len(S)+1): # 슬라이싱할 원소 개수
    s = set()
    j = 0
    while j+i <= len(S):
        s.add(S[j:j+i]) # i개수만큼 슬라이싱
        j += 1
    result += len(s)

print(result)
