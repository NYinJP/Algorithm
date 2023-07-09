import java.util.*;

public class Solution {
    public int solution(int n) {
        String num = n+"";
        char [] numChar = num.toCharArray();
        int result = 0;
        for(int i = 0;i<numChar.length; i++){
            result +=num.charAt(i)-'0';
        }
        return result;
    }
}