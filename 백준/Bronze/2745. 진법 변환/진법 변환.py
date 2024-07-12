N, B = input().split(" ")
num_list = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
result = 0

for i, letter in enumerate(N[::-1]):
    result += int(B) ** i * num_list.index(letter)

print(result)