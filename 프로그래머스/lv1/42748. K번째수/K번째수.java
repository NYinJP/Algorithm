import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int result [] = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            
            int first = commands[i][0];
            int last = commands[i][1];
            int number = commands[i][2];
            
            int [] arr2 = Arrays.copyOfRange(array, first-1,last);
            Arrays.sort(arr2);
            result[i] = arr2[number-1];
        
        }
        return result;
    }
}