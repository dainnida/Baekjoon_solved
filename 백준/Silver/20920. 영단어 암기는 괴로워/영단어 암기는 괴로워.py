import sys
input = sys.stdin.readline

N, M = map(int, input().split())
dic = dict()
note = []

for _ in range(N):
    word = input().strip()
    if len(word) >= M:
        if word in dic:
            dic[word] += 1 
        else:
            dic[word] = 1
dic = dict(sorted(dic.items())) # 알파벳 순으로 정렬

dic = dict(sorted(dic.items(), key = lambda x : (x[1], len(x[0])), reverse=True))
print(*dic, sep='\n')