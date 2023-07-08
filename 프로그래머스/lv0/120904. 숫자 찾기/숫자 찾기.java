class Solution {
    public int solution(int num, int k) {
        
        int result=0;

        char [] numChar = String.valueOf(num).toCharArray();
        for (int i = 0; i < numChar.length; i++) {
            if(numChar[i] -'0' == k){
                result = i+1;
                break;
            }else{
                result = -1;
            }
        }
        return result;
    }
}