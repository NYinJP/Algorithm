import java.util.*;
class Solution {
    public String solution(String s) {
        
        String [] sArr = s.split("");
        Arrays.sort(sArr);
        String answer = "";
        for(int i=0;i<sArr.length;i++){
            answer+=sArr[sArr.length-1-i];
        }
        return answer;
    }
}