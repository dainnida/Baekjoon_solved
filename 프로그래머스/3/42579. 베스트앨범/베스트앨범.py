def solution(genres, plays):
    songs = {}
    cnt = {}
    for i in range(len(genres)):
        if genres[i] in songs.keys():
            songs[genres[i]] += [[plays[i], i]]
            cnt[genres[i]] += plays[i]
        else:
            songs[genres[i]] = [[plays[i], i]]
            cnt[genres[i]] = plays[i]
            
    cnt = sorted(cnt.items(), key=lambda x:x[1], reverse=True)
    for s in songs.values():
        s.sort(key=lambda x:(-x[0], x[1]))
        
    answer = []
    for genre, _ in cnt:
        for _, num in songs[genre][:2]:
            answer.append(num)
    return answer