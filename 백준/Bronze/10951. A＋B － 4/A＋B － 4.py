# while True:
#     try:
#         A, B = map(int, input().split())
#         print(A+B)
#     except:
#         break
import sys

for i in sys.stdin:
    A, B = map(int, i.split())
    print(A+B)