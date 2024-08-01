A, B = input().split()

A = list(A)
A.reverse()
A = ''.join(A)

B = list(B)
B.reverse()
B = ''.join(B)

# if A>B:
#     print(A)
# else:
#     print(B)
print(max(A, B))