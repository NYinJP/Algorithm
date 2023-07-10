import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int [] arr2 = Arrays.stream(arr).filter(x->x%divisor ==0).toArray();
          
        Arrays.sort(arr2);
        if(arr2.length==0){
            return new int[]{-1};        
        }
        return arr2;
    }
}