# A, B = map(list, input().split())
# A.reverse()
# A = ''.join(A)
# B.reverse()
# B = ''.join(B)

A, B = input().split()
A = A[::-1]
B = B[::-1]

print(max(A, B))
