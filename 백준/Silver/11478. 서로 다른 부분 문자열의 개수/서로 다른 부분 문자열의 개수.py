S = input()
s = set()

for i in range(1, len(S)+1): # 원소 개수
    j = 0
    while j+i <= len(S):
        s.add(S[j:j+i])
        j += 1

print(len(s))
