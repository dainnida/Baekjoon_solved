# alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
# N, B = input().split()
# B = int(B)
# sum = 0

# for i in range(len(N)):
#     sum += (B ** i) * alphabet.index(N[len(N)-i-1])

# print(sum)

N, B = input().split(" ")
num_list = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
result = 0

for i, letter in enumerate(N[::-1]):
    result += int(B) ** i * num_list.index(letter)

print(result)
