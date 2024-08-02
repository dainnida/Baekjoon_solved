dial = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"] 
time = 0

str = input()
for i in str:
    for j in dial:
        if i in j:
            time += dial.index(j) + 3

print(time)