import sys

N = int(input())
words = []

for _ in range(N):
    word = sys.stdin.readline().strip()
    if word not in words:
        words.append(word)

words.sort(key = lambda x: (len(x), x))

print(*words, sep='\n')