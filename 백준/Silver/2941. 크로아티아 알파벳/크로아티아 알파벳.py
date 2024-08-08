croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
str = input()

for i in croatia:
    str = str.replace(i, '*')
print(len(str))