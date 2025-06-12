import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
    
        char[] strArr = my_string.toCharArray();
        char[] preArr = is_prefix.toCharArray();

        if(strArr.length<preArr.length) return 0;

        for (int i = 0; i < preArr.length; i++) {
            if (strArr[i] != preArr[i]) {
                return 0;
            }
        }return 1;
    }
}