class Solution {
    public int solution(int n) {
        double num = Math.sqrt(n);
        int result = 0;
        for(int i = 0; i<=num ; i++){
            if(i == num) {
                result = 1;
                break;
            }
            else result = 2;
        }
        return result;
    }
}