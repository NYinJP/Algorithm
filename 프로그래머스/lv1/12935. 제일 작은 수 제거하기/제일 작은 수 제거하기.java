import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        return Arrays.stream(arr).filter(a->a>Arrays.stream(arr).min().getAsInt()).toArray();
    
        
    }
}