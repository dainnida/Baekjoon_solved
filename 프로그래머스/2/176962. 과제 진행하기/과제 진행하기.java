import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        List<String> answer = new ArrayList<>();
        // 진행 중이던 과제를 담는 스택 (과제의 이름과 남은 시간 담음)
        Deque<String[]> stopStack = new ArrayDeque<>();
        int currTime = 0;
        int currIndex = 0;
        
        // 시작 시간순으로 정렬
        Arrays.sort(plans, (a, b) -> {
            int timeA = calcTime(a[1]);
            int timeB = calcTime(b[1]);
            
            return timeA - timeB;
        });
        
        // 2차원이던 배열을 큐로 바꿈
        Deque<String[]> planQueue = new ArrayDeque<>(Arrays.asList(plans));
        
        while(!planQueue.isEmpty()) {
            String[] currPlan = planQueue.poll();
            int finTime = calcTime(currPlan[1]) + Integer.parseInt(currPlan[2]);
            
            // 다음 과제가 있음
            if (!planQueue.isEmpty()) {
                int nextTime = calcTime(planQueue.peek()[1]);
                
                // 다음 과제 전에 현재 과제 마칠 수 있음
                if (finTime <= nextTime) {
                    // 과제 완료
                    answer.add(currPlan[0]);
                    // 현재 시간 갱신
                    currTime = finTime;
                    
                    // 다음 과제 전까지 시간이 남았고 멈춘 과제도 있음
                    while (currTime < nextTime && !stopStack.isEmpty()) {
                        // 가장 최근에 멈춘 과제 꺼냄
                        String[] stopPlan = stopStack.pop();
                        int remainTime = Integer.parseInt(stopPlan[1]);

                        // 다음 과제 전에 멈춘 과제 마칠 수 있음 = 과제 남은 시간이 현재 시간과 다음 과제 시작 시간의 gap보다 작거나 같음
                        if (remainTime <= nextTime - currTime) {
                            // 과제 완료
                            answer.add(stopPlan[0]);
                            // 현재 시간 갱신
                            currTime += remainTime;
                        }
                        else {
                            // 남은 시간만큼 계산해서 다시 스택에 넣음
                            stopStack.push(new String[]{stopPlan[0], String.valueOf(remainTime - (nextTime - currTime))});
                            // 현재 시간 갱신
                            currTime = nextTime;
                        }
                    }
                }
                
                // 다음 과제 전에 현재 과제 마칠 수 없음
                else {
                    int remainTime = finTime - nextTime;
                    // 스택에 이름과 남은 시간 넣음
                    stopStack.push(new String[]{currPlan[0], String.valueOf(remainTime)});
                    // 현재 시간 갱신
                    currTime = nextTime;
                }
            }
            else { // 마지막 과제임
                answer.add(currPlan[0]);
            }
        }
        
        // 멈춘 과제 남아 있다면 모두 수행
        while (!stopStack.isEmpty()) {
            answer.add(stopStack.pop()[0]);
        }
        
        return answer.toArray(new String[0]);
    }
    
    public int calcTime(String start) {
        return Integer.parseInt(start.split(":")[0]) * 60 + Integer.parseInt(start.split(":")[1]);
    }
}