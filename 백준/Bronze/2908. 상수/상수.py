A, B = map(list, input().split())
A.reverse()
A = ''.join(A)
B.reverse()
B = ''.join(B)

print(max(A, B))