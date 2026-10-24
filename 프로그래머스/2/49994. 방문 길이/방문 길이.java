import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        String commands = "URLD"; // 반대되는 U&D와 R&L가 대칭이 되게
        Map<String, int[]> moves = new HashMap<>();
        moves.put("U", new int[]{0, 1});
        moves.put("D", new int[]{0, -1});
        moves.put("R", new int[]{1, 0});
        moves.put("L", new int[]{-1, 0});
        boolean[][][] visited = new boolean[11][11][4];
        int cx = 5, cy = 5; // 현재 위치, visited 좌표 따라 (0, 0)을 (5, 5)로
        
        for (int i = 0; i < dirs.length(); i++) {
            String dir = dirs.charAt(i) + "";
            int[] move = moves.get(dir);
            int nx = cx + move[0], ny = cy + move[1];
            
            if (nx < 0 || nx > 10 || ny < 0 || ny > 10)
                continue; // 명령 무시
            if (!visited[cx][cy][commands.indexOf(dir)]) { // 처음 가는 길
                visited[cx][cy][commands.indexOf(dir)] = true;
                visited[nx][ny][3 - commands.indexOf(dir)] = true; // 양방향 모두 왔던 길 됨!
                answer++;
            }
            cx = nx; cy = ny;
        }
        
        return answer;
    }
}