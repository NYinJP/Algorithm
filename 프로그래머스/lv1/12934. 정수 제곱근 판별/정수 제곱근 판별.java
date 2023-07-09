class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        if(n%num == 0){
            return (long)((num+1)*(num+1));
            // return (long)Math.pow(num+1,2);
        } return -1;
    }
}