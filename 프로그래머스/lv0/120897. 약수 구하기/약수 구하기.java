import java.util.*;
class Solution {
    public int[] solution(int n) {
         int [] A = new int[n+1];
        for(int i=1;i<=n;i++){
            A[i]=i;
        }
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if(n%A[i] == 0) answer.add(i);
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}