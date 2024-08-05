# str = input()

# if str == str[::-1]:
#     print(1)
# else:
#     print(0)

str = list(input())

if str == list(reversed(str)):
    print(1)
else:
    print(0)
