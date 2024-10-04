import sys

sentence = input()
while sentence != '.':
    sentence = list(sentence.split())
    stack = []

    for i in sentence:
        if i.isalpha():
            continue
        else:
            for j in i:
                if j == ')':
                    if stack and stack[-1] == '(':
                        stack.pop()
                    else:
                        stack.append(j)
                        break
                elif j == ']':
                    if stack and stack[-1] == '[':
                        stack.pop()
                    else:
                        stack.append(j)
                        break
                elif j == '(' or j == '[':
                    stack.append(j)
    if not stack:
        print("yes")
    else:
        print("no")
    sentence = input()