class Solution {
    public int solution(int[] a, int[] b) {
        long result = 0;
        for(int i=0;i<a.length;i++){
            result += a[i]*b[i];
        }
        return (int)result;
    }
}