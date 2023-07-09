import java.util.*;
class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int [] num = new int[sArr.length];
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(sArr[i]);
        }
        Arrays.sort(num);
        int max = num[num.length - 1];
        int min = num[0];
        
        return min +" "+max;
        
    }
}