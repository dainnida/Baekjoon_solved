# while True:
#     try:
#         str = input()
#         print(str)
#     except EOFError:
#         break
import sys

s = sys.stdin.readlines()
for i in s:
    print(i.strip())
