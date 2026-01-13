import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        
                Arrays.sort(indices);
        String result = "";
        int idx = 0;
        int i=0;

        while (i < my_string.length()) {
            if (idx<indices.length && i == indices[idx]) {
                idx++;
            } else {
                result += my_string.charAt(i);
            }
            i++;
        }

        return result;

    }
}