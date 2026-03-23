def solution(dirs):
    visited_width = [[False]*10 for _ in range(11)]
    visited_height = [[False]*10 for _ in range(11)]
    move = {"U": [0, 1], "D": [0, -1], "R": [1, 0], "L": [-1, 0]}
    where = [0, 0]
    for dir in dirs:
        if where[0]+move[dir][0] > 5 or where[0]+move[dir][0] < -5 \
            or where[1]+move[dir][1] > 5 or where[1]+move[dir][1]  < -5:
            continue
        if dir in "DL":
            where[0] += move[dir][0]
            where[1] += move[dir][1]
        if dir in "RL":
            visited_width[where[1]+5][where[0]+5] = True
        else:
            visited_height[where[0]+5][where[1]+5] = True
        if dir in "UR":
            where[0] += move[dir][0]
            where[1] += move[dir][1]

    return sum(row.count(True) for row in visited_width) \
            + sum(column.count(True) for column in visited_height)