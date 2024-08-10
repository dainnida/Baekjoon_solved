gradeList = ["A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"]
creditList = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0]
result = 0
sum = 0

for _ in range(20):
    subject, credit, grade = map(str, input().split())
    if grade == "P":
        continue
    result += float(credit) * creditList[gradeList.index(grade)] # find는 리스트 사용 불가!
    sum += float(credit)

print(result/sum)