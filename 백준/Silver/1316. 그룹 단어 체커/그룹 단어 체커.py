num = int(input())
count = num

for _ in range(num):
    word = input()
    for i in range(len(word)-1):
        if word[i] in word[i+1:] and word[i] != word[i+1]:
            count -= 1
            break

print(count)
