class Solution {
    public String solution(String s) {
        String[] alpha = s.split("");
        if(alpha.length%2 != 0 ){
            return alpha[alpha.length/2];
        }else{
            return alpha[alpha.length/2 -1]+alpha[alpha.length/2];
        }
    }
}