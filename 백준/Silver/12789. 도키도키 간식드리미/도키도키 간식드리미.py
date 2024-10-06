import sys
input = sys.stdin.readline

N = int(input())
now = list(map(int, input().split()))
stack = []
next = 1

while now or stack:
    if now and now[0] == next:
        now.pop(0)
        next += 1
    elif stack and stack[-1] == next:
        stack.pop()
        next += 1
    elif next in now:
        for _ in range(now.index(next)):
            stack.append(now.pop(0))
    else:
        break

if stack:
    print("Sad")
else:
    print("Nice")