import sys

n = int(input())
log = {}

for _ in range(n):
    name, state = sys.stdin.readline().split()

    if state == 'enter':
        log[name] = 1
    else:
        log.pop(name)
        
log = sorted(log, reverse=True)
print(*log, sep='\n')