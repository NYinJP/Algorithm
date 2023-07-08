import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList <Integer> str = new ArrayList<>();
        for(int i=0 ; i < my_string.length() ; i++){
            if('0'<=my_string.charAt(i) && my_string.charAt(i)<='9'){
                str.add(my_string.charAt(i)-'0');
            }
        }
        Collections.sort(str);
        int[] arr = str.stream()
	.mapToInt(Integer::intValue)
    	.toArray();
        return arr;
    }
}