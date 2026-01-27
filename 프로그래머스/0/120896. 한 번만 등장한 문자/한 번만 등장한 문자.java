import java.util.*;
class Solution {
    public String solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(String.valueOf(s.charAt(i)), map.getOrDefault(String.valueOf(s.charAt(i)), 0) + 1);
        }

        StringBuilder builder = new StringBuilder();

        
        for (String str : map.keySet()) {
            if (map.get(str) == 1) {
                builder.append(str);
            }
        }
        
        char[] arr = builder.toString().toCharArray();
        
        Arrays.sort(arr);

        String result = "";
        for (char c : arr) {
            result += c;
        }
        return result;
    }
}