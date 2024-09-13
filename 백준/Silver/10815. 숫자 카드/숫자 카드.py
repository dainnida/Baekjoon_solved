import sys

N = int(input())
cards = list(map(int, sys.stdin.readline().split()))
M = int(input())
finds = list(map(int, sys.stdin.readline().split()))

cards.sort()

def binary_search(target):
    low, high = 0, N-1

    while low <= high:
        mid = (low + high) // 2
        if target == cards[mid]:
            return 1
        elif target > cards[mid]:
            low = mid + 1
        else:
            high = mid - 1
    return 0

for i in finds:
    print(binary_search(i), end=' ')
