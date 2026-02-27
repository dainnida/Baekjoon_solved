def solution(brown, yellow):
    for y in range(1, int(yellow**0.5)+1):
        if yellow % y == 0:
            x = yellow / y
            if (x+2) * (y+2) == brown + yellow:
                return [x+2, y+2]
    
    # # (x+2)(y+2) = brown + yellow
    # total = (brown-4) / 2 # yellow_width(x) + yellow_height(y)
    # product = yellow # yellow_width(x) * yellow_height(y)
    # x = int(total + (total**2 - 4*product)**0.5) / 2
    # y = total - x
    # return [x+2, y+2]