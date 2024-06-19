import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
                ArrayList<Integer> stack = new ArrayList<>();
        
        stack.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(stack.get(stack.size()-1) == arr[i]){
                continue;
            }else{
                stack.add(arr[i]);
            }
        }
        
        return stack.stream().mapToInt(i->i).toArray(); 
    }
}