def solution(sizes):
    # 가로는 두 변 중 긴 것, 세로는 두 변 중 작은 것 넣어서 그 중 max끼리 곱
    maxW , maxH = 0, 0
    for s in sizes:
        width = max(s[0], s[1])
        height = min(s[0], s[1])
        maxW = max(width, maxW)
        maxH = max(height, maxH)
    return maxW * maxH