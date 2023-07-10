class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String check = ineq+eq;
        int result =0;
        if(ineq.equals(">")){
            if(eq.equals("=")){
                result = (n>=m)?1:0;
            }else result = (n>m)?1:0;
        }else if(ineq.equals("<")){
            if(eq.equals("=")){
                result = (n<=m)?1:0;
            }else{
                result = (n<m)?1:0;
            }
        }
        return result;
    }
}