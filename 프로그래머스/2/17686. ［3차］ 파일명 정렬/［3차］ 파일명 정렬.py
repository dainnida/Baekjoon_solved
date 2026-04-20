def solution(files):
    answer = []
    for idx, file in enumerate(files):
        for i, f in enumerate(file):
            if f.isdecimal():
                start = i
                break
        for i in range(start, min(len(file), start+5)):
            if file[i].isdecimal():
                fin = i
            else:
                break
        head = file[:start].upper()
        number = file[start:fin+1]
        answer.append((file, head, number))

    answer.sort(key = lambda x : (x[1], int(x[2])))
    return [a[0] for a in answer]