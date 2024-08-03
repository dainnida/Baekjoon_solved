# while True:
#     try:
#         str = input()
#         print(str)
#     except EOFError:
#         break
import sys

s = sys.stdin.readline()
for i in s:
    print(i.rstrip())
