A, B = map(int, input().split())

if(B>=45):
    print(A, B-45)
else:
    if(A==0):
        print(23, B+60-45)
    else:
        print(A-1, B+15)