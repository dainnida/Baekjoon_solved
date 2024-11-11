import sys
input = sys.stdin.readline

N = int(input())
time = []
for _ in range(N):
    a, b = map(int, input().split())
    time.append((a, b))

time.sort(key=lambda x : (x[1], x[0]))

end = 0
cnt = 0
for i in time:
    if end <= i[0]:
        end = i[1]
        cnt += 1

print(cnt)