# A, B = map(list, input().split())
# A.reverse()
# A = int(''.join(A))
# B.reverse()
# B = int(''.join(B))

A, B = input().split()
A = A[::-1]
B = B[::-1]

print(max(A, B))
