import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i].substring(s, s + l);
            if (Integer.valueOf(str) > k) {
                list.add(Integer.valueOf(str));
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}