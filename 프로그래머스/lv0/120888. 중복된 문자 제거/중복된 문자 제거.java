import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        HashMap<Integer, String> str = new HashMap<>();
        int index =0;
        for (int i = 0; i < my_string.length(); i++) {
            if(str.containsValue(my_string.charAt(i)+"")) continue;
            str.put(index, my_string.charAt(i)+""); index++;
        }
        String result = "";
        for(int i = 0; i < str.size(); i++){
            result += str.get(i);
        }
        return result;
        
    }
    
}