import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string=my_string.toLowerCase();
        char [] strArr = my_string.toCharArray();
        Arrays.sort(strArr);
        
        return new String(strArr);

        // String result ="";
        // for (int i = 0; i < strArr.length; i++) {
        //     result +=strArr[i];
        // }
        // return result;
    }
}