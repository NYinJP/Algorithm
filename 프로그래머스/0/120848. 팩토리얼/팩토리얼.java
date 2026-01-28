class Solution {
    public int solution(int n) {
        int[] factorial = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};
        int result = 0;
        
        for (int i = 1; i < factorial.length; i++) {
            if (n >= factorial[i - 1] && n < factorial[i]) {
                result = i;
            } else if (n >= factorial[i]) {
                result = i+1;
            }
        }
        return result;
    }
}