import java.util.*;
class Solution {
    public String solution(String s) {
//         // 아스키코드값으로!?
//         char [] sArr = s.toCharArray();
    
        
//         int check = 0;
//         String result = "";
//         for(int i = 0;i<sArr.length;i++){
//             if(sArr[i] >= 'a' && sArr[i] <= 'z' && i != 0){
//                 check = i-1; break;
//             }
//         }
//         for(int i = 0;i<sArr.length;i++){
//             result+=sArr[i]+"";
//         }
//         return result.substring(check+1) + result.substring(1,check+1);
        
        String [] sArr = s.split("");
        Arrays.sort(sArr);
        String answer = "";
        for(int i=0;i<sArr.length;i++){
            answer+=sArr[sArr.length-1-i];
        }
        return answer;
    }
}