import java.util.*;

class Solution {
    static class FileItem implements Comparable<FileItem> {
        String original;
        String head;
        int number;

        public FileItem(String original) {
            this.original = original;
            
            int start = 0;
            for (int i = 0; i < original.length(); i++) {
                if (Character.isDigit(original.charAt(i))) {
                    start = i;
                    break;
                }
            }
            
            int end = start;
            while (end < original.length() && end < start + 5 && Character.isDigit(original.charAt(end))) {
                end++;
            }
            
            this.head = original.substring(0, start).toUpperCase();
            this.number = Integer.parseInt(original.substring(start, end));
        }

        @Override
        public int compareTo(FileItem other) {
            // 1순위: HEAD 사전순 비교
            int headCompare = this.head.compareTo(other.head);
            if (headCompare != 0) {
                return headCompare;
            }
            // 2순위: NUMBER 오름차순 비교
            return Integer.compare(this.number, other.number);
        }
    }

    public String[] solution(String[] files) {
        // 3. 변환 및 정렬
        FileItem[] fileItems = new FileItem[files.length];
        for (int i = 0; i < files.length; i++) {
            fileItems[i] = new FileItem(files[i]);
        }

        Arrays.sort(fileItems);

        String[] answer = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            answer[i] = fileItems[i].original;
        }
        
        return answer;
    }
}