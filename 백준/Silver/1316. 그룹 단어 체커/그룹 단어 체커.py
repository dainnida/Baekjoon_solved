num = int(input())
count = num

for i in range(num):
    word = input()
    char = ''
    alphabet = []
    for j in word:
        if j in alphabet and char != j:
            count -= 1
            break
        alphabet.append(j)
        char = j

print(count)