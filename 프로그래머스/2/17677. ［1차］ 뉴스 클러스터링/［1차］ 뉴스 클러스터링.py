from collections import Counter
import math

def solution(str1, str2):
    str1_pairs = [str1[i:i+2].lower() for i in range(len(str1)-1)]
    A = list(filter(lambda x: x.isalpha(), str1_pairs))
    str2_pairs = [str2[i:i+2].lower() for i in range(len(str2)-1)]
    B = list(filter(lambda x: x.isalpha(), str2_pairs))
    
    if not A and not B:
        return 1 * 65536
    
    inter_count, uni_count = 0, len(A) + len(B)
    dicA, dicB = Counter(A), Counter(B)
    A, B = set(A), set(B)
             
    inter = A & B
    uni = A | B
    for i in inter:
        inter_count += min(dicA[i], dicB[i])
    print(inter_count)
    uni_count -= inter_count
        
    return math.floor(inter_count / uni_count * 65536)