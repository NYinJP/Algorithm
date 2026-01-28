import java.util.*;
class Solution {
    public int solution(String s) {
        String[] array = s.split(" ");

        Stack<String> stack = new Stack<>();
        for (String str : array) {
            if (str.equals("Z")) {
                stack.pop();
                
            }else stack.add(str);
        }

        int result = 0;
        
        while (!stack.isEmpty()) {
            result += Integer.parseInt(stack.pop());
        }
        return result;
    }
}