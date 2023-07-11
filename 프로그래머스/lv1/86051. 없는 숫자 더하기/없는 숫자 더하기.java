import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        for(int i=0;i<numbers.length;i++){
            hashSet.add(numbers[i]);
        }
        int sum =0;
        for(int i=0;i<=9;i++){
            if(!hashSet.contains(i)) sum+=i;
        }
        return sum;
    }
}