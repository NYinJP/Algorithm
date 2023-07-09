class Solution {
    public long solution(int a, int b) {
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        
        long result =0;
        for(int i = small;i<=big;i++){
            result+=(long)i;
        }
        return result;

    }
}