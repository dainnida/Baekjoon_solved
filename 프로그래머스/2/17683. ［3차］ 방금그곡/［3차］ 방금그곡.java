import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        // C#를 중간에 잘라서 C와 같다고 오해하지 않도록 하나의 알파벳으로 치환
        m = m.replaceAll("C#", "c")
            .replaceAll("D#", "d")
            .replaceAll("F#", "f")
            .replaceAll("G#", "g")
            .replaceAll("A#", "a");
        
        // 재생 시간을 내림차순으로 정렬
        Arrays.sort(musicinfos, (a, b) -> {
            int aTime = getMinutes(a.substring(6, 11)) - getMinutes(a.substring(0, 5));
            int bTime = getMinutes(b.substring(6, 11)) - getMinutes(b.substring(0, 5));
            
            return bTime - aTime;
        });
        
        for (String music : musicinfos) {
            String[] music_arr = music.split(",");
            int playTime = getMinutes(music_arr[1]) - getMinutes(music_arr[0]);
            String title = music_arr[2];
            String originMelody = music_arr[3];
            String playMelody = "";
            
            // C#를 중간에 잘라서 C와 같다고 오해하지 않도록 하나의 알파벳으로 치환
            originMelody = originMelody.replaceAll("C#", "c")
                .replaceAll("D#", "d")
                .replaceAll("F#", "f")
                .replaceAll("G#", "g")
                .replaceAll("A#", "a");
            
            // 재생 시간만큼 재생됨
            if (playTime <= originMelody.length()) {
                playMelody = originMelody.substring(0, playTime);
            }
            // 재생 시간이 더 길어 멜로디가 반복돼야 함
            else {
                for (int i = 0; i < playTime / originMelody.length(); i++)
                    playMelody += originMelody;
                for (int i = 0; i < playTime % originMelody.length(); i++)
                    playMelody += originMelody.charAt(i);
            }
            
            if (playMelody.contains(m))
                return title;
        }
        
        return "(None)";
    }
    
    public int getMinutes(String time) {
        String[] time_arr = time.split(":");
        int hour = Integer.parseInt(time_arr[0]);
        int minute = Integer.parseInt(time_arr[1]);
        
        return 60 * hour + minute;
    }
}