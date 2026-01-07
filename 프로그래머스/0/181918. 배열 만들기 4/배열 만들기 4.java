import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {

            // stk가 빈 배열이라면
            if (list.size() == 0) {
                list.add(arr[i]);
                i++;
                // stk가 빈 배열이 아니라면
            } else{
                if (list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i]);
                    i++;
                } else if (list.get(list.size() - 1) >= arr[i]) {
                    list.remove(list.size() - 1);
                }
            }

        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}