import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(n);

        while (true) {
            if (n == 1) {
                break;
            }
            if (n % 2 == 0) {
                n=n/2;
            }else{
                n = 3*n +1;
            }
            list.add(n);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}