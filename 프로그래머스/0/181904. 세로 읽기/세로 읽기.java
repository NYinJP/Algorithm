import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> list = new ArrayList<>();
        
        // 나누어 떨어진다고 가정했습니다.
        for (int i = 1; i <= (my_string.length()/m); i++) {
            list.add(my_string.substring(m * (i - 1), m * i));
        }

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).charAt(c-1);
        }
        return result;
    }
}