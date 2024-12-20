import sys
input = sys.stdin.readline

S = input().strip()
q = int(input())
cnt = [[0] * 26]

cnt[0][ord(S[0])-97] = 1
for i in range(1, len(S)):
    cnt.append(cnt[i-1][:])
    cnt[i][ord(S[i])-97] += 1

for _ in range(q):
    lst = input().split()
    a, l, r = lst[0], int(lst[1]), int(lst[2])
    if l == 0:
        print(cnt[r][ord(a)-97])
    else:
        print(cnt[r][ord(a)-97]-cnt[l-1][ord(a)-97])