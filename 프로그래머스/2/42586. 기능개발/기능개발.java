import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
// LinkedList<Integer> queue = new LinkedList<>();
//         LinkedList<Integer> queueSpeed = new LinkedList<>();
//         List<Integer> result = new ArrayList<>();

//         for(int i: progresses){
//             queue.add(i);
//         }
//         for (int i : speeds) {
//             queueSpeed.add(i);
//         }

//         int answer = 0; // 선언 및 초기화
//         while(!queue.isEmpty()) {
//             for (int i = 0; i < queue.size(); i++) {
//                 int element = queue.poll();
//                 int speed = queueSpeed.poll();
//                 queue.add(element + speed);
//                 queueSpeed.add(speed);
//             }

//             // 맨 끝 자리가 100 이상일 때,
//             if(queue.peek()>=100) {
//                 while(true) {
//                     queue.poll();queueSpeed.poll();
//                     answer++;
//                     if(queue.isEmpty()) break;
//                     if(queue.peek()<100) break;
//                 }
//                 result.add(answer);
//                 answer = 0;
//             }
//         }

//         return result.stream().mapToInt(i -> i).toArray();
                int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}