class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        /*
        a가 첫째항, d가 공차
        */
        int result = 0;
        for(int i=0;i<included.length;i++){
            // true이면
            if(included[i]){
                result += (a + d*(i));
            }else{
                continue;
            }
        }
        return result;
    }
}