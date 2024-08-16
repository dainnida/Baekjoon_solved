num = int(input())
room = 1
count = 1

while num > room:
    room += count*6
    count += 1

print(count)