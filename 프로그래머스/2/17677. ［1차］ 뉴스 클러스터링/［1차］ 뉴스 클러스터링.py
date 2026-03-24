from collections import Counter

def solution(str1, str2):
    str1_pairs = [str1[i:i+2].lower() for i in range(len(str1)-1)]
    A = list(filter(lambda x: x.isalpha(), str1_pairs))
    str2_pairs = [str2[i:i+2].lower() for i in range(len(str2)-1)]
    B = list(filter(lambda x: x.isalpha(), str2_pairs))
    
    if not A and not B:
        return 1 * 65536
    
    dicA, dicB = Counter(A), Counter(B)
             
    inter = dicA & dicB
    uni = dicA | dicB
        
    return int(sum(inter.values()) / sum(uni.values()) * 65536)