import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        Queue<Integer> q = new LinkedList<>();
    
        // l이상 r이하 5와 0으로만 이루어진 수 오름차순으로 반환하기
        List<Integer> result = new ArrayList<>();

        // 0은 따로 예외처리
        int startNum = 5;

        // 큐에 넣기
        q.add(startNum);
        if (startNum >= l && startNum <= r) {
            result.add(startNum);
        }

        while (!q.isEmpty()) {

            // 큐에서 빼오기(이후 삭제)
            int num1 = q.poll() * 10;
            int num2 = num1 + 5;

            if (num1 <= r) {
                q.add(num1);
                if(num1>=l) result.add(num1);
            }
            if (num2 <= r) {
                q.add(num2);
                if(num2>=l) result.add(num2);
            }

        }

        if (l==0) {
            result.add(0);
        }

        if (result.size() == 0) {
            int[] resultF = {-1};
            return resultF;
        }else{
            result.sort(Comparator.naturalOrder());
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}