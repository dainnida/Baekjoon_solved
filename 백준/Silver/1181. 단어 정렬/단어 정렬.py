import sys

N = int(input())
words = []

for _ in range(N):
    word = sys.stdin.readline().strip()
    words.append(word)

words = list(set(words))
words.sort()
words.sort(key = len)

print(*words, sep='\n')