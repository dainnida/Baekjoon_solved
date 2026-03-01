import math

def lcm(a, b):
    return a*b // math.gcd(a, b)

def solution(arr):
    while (len(arr)>1):
        a = arr.pop()
        b = arr.pop()
        arr.append(lcm(a, b))
    return arr[0]