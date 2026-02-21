def solution(s):
    answer = []
    word_lst = s.split(" ")
    for word in word_lst:
        word = word.lower()
        if word:
            word = word[0].upper() + word[1:]
        answer.append(word)
    return " ".join(answer)