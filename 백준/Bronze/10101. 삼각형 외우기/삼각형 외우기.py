angle = [int(input()) for _ in range(3)]

if angle.count(60) == 3:
    print("Equilateral")
elif sum(angle) == 180 and len(set(angle)) == 2:
    print("Isosceles")
elif sum(angle) == 180 and len(set(angle)) == 3:
    print("Scalene")
else:
    print("Error")