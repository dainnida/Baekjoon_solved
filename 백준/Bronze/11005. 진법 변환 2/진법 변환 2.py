# alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
# N, B = map(int, input().split())
# num = []

# while N>0:
#     num.append(N % B)
#     N = N // B

# for i in num[::-1]:
#     print(alphabet[i], end='')

N, B = map(int, input().split(" "))
num_list = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
result = ''

while N != 0:
    result += str(num_list[N % B])
    N = N // B

print(result[::-1])
