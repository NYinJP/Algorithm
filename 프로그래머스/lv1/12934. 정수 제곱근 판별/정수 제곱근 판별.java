class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        if(n%num == 0){
            return (long)((num+1)*(num+1));
        } return -1;
    }
}