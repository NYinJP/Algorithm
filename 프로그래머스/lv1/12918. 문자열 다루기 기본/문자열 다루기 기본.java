import java.util.*;
class Solution {
    public boolean solution(String s) {
        if( s.length() != 4 || s.length() != 6) return false;
        
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z') return false;
            else if(s.charAt(i)>='A'&& s.charAt(i)<='Z') return false;
            else continue;
        }
        return true;
    }
}