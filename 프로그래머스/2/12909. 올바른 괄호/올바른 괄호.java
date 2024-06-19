import java.util.*;
class Solution {
    boolean solution(String s) {
        
        boolean result = false;
        ArrayList<Character> stack = new ArrayList<>();

        char[] chars = s.toCharArray();
        for(char c: chars){
            if(c =='('){
                stack.add(c);
            }else{ // ')'라면
                if(stack.size() != 0) stack.remove(stack.size()-1);
                else stack.add(c);
            }
        }
        if(stack.isEmpty()) result = true;
        return result;
    }
}