import java.util.*;

class Solution {
public String solution(String[] participant, String[] completion) {
        // 참가자 목록과 완주자 목록을 HashMap으로 변환하여 출전 횟수를 관리
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 출전 횟수 초기화
        for (String person : participant) {
            map.put(person, map.getOrDefault(person, 0) + 1);
        }

        // 완주자 목록에 있는 사람의 출전 횟수 감소
        for (String person : completion) {
            map.put(person, map.get(person) - 1);
        }

        // 출전 횟수가 1인 사람이 완주하지 못한 사람
        String answer = "";
        for (String person : map.keySet()) {
            if (map.get(person) == 1) {
                answer = person;
                break;
            }
        }

        return answer;
    }
}