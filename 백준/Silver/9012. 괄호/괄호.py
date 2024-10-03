import sys

T = int(sys.stdin.readline())

for _ in range(T):
    num = list(sys.stdin.readline().strip())
    if len(num) % 2 != 0:
        print("NO")
        continue

    stack = []
    for i in num:
        if not stack: # 비어 있다면
            if i == ')':
                print("NO")
                break
            stack.append(i)
        else:
            if stack[-1] != i:
                stack.pop()
            else:
                stack.append(i)
    else:
        if not stack:
            print("YES")
        else:
            print("NO")