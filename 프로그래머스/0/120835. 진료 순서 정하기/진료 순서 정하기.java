import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
                int[] newArr = Arrays.copyOf(emergency, emergency.length);
        // 숫자가 제일 높을수록 응급환자
        Arrays.sort(newArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int k=0;
        for (int i : newArr) {
            map.put(i, k);
            k++;
        }
        int[] result = new int[emergency.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = result.length - map.getOrDefault(emergency[i],0);
        }
        return result;
    }
}