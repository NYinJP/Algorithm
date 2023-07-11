import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        for(int i=0;i<numbers.length;i++){
            hashSet.add(numbers[i]);
        }
        for(int i=0;i<=9;i++){
            if(hashSet.contains(i)) hashSet.remove(i);
            else hashSet.add(i);
        }
        return hashSet.stream().mapToInt(x->x).sum();
    }
}