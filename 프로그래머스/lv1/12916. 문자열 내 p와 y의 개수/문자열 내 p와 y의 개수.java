import java.util.*;
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        char [] arr = s.toCharArray();
        int check_p =0;
        int check_y = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]=='p') check_p++;
            else if(arr[i]=='y') check_y++;
            else continue;
        }
            return (check_p==check_y)?true:false;
            
    }
}