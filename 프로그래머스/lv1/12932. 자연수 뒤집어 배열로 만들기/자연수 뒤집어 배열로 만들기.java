import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str = n+"";
        char[] strArr = str.toCharArray();

        String result = "";
        for(int i=0;i<strArr.length;i++){
            result+=strArr[strArr.length-1-i];
        }
        int [] resultArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            resultArr[i] = result.charAt(i)-'0';
        }
        return resultArr;
        
    }
}