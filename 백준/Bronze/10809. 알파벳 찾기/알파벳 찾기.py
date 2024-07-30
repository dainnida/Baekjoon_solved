S = input()
nums = [-1] * 26

for i in range(len(S)):
    if nums[ord(S[i])-97] == -1:
        nums[ord(S[i])-97] = i

print(*nums)