class Solution {
    public String solution(int n) {
        String result = "수박";
        if(n%2 == 0 ){
            return result.repeat(n/2);
        }
        return result.repeat(n/2)+"수";
    }
}