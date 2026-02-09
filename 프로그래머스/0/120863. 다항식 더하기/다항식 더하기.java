import java.util.*;
class Solution {
    public String solution(String polynomial) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("x", 0);
        map.put("number", 0);

        String[] str = polynomial.split(" ");

        for (int i = 0; i < str.length; i += 2) {
            if (str[i].contains("x")) {
                if (str[i].equals("x")) {
                    map.put("x", map.get("x") + 1);
                } else {
                    map.put("x", map.get("x") + Integer.valueOf(str[i].substring(0, str[i].length() - 1)));
                }
            } else {
                map.put("number", map.get("number") + Integer.valueOf(str[i]));
            }
        }

        /**
         * 제약조건
         * 계수가 1이면 x만 표시
         * x 계수 0 이면 x 항 출력 x
         * x 계수 0 상수 0 이면 0 을 표시
         */
        Integer value = map.get("number");
        Integer x = map.get("x");

        String frontx = "x ";
        String numberStr = "+ " + value;
        
        if (x != 1) {
            frontx = x.toString()+"x ";
        }
        if (x == 0) {
            frontx = "";
            numberStr = value.toString();
        }
        if (value == 0) {
            numberStr = "";
        }
        return (frontx+numberStr).trim();
    }
}