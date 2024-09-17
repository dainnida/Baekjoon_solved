import sys

N, M = map(int, input().split())
pockemon = {}

for i in range(N):
    pockemon[sys.stdin.readline().strip()] = i+1

reversedPokemon = dict(map(reversed, pockemon.items()))

for _ in range(M):
    find = sys.stdin.readline().strip()
    if pockemon.get(find) != None:    # 입력값이 알파벳이다.
        print(pockemon[find])
    else:
        print(reversedPokemon[int(find)])