import java.util.*;
class Solution {
    public long solution(long n) {
        String s = n+"";
        char[] sNum = s.toCharArray();
        Arrays.sort(sNum);
        String result = "";
        for(int i = 0;i < sNum.length; i++){
            result +=sNum[sNum.length-1-i];
        }
        return Long.parseLong(result);
    }
}