N, B = map(int, input().split(" "))
num_list = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
result = ''

while N != 0:
    result += str(num_list[N % B])
    N = N // B

print(result[::-1])