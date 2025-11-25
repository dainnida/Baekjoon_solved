def solution(nums):
    s = set(nums)
    print(list(s))
    if len(s) < len(nums)/2:
        return len(s)
    return len(nums)/2
    