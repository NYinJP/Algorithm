class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int[] result = new int[absolutes.length];
        for(int i=0;i<absolutes.length;i++){
            
            String sign = "";
            
            if(signs[i]) sign+="+";
            else sign+="-";
            result[i] = Integer.parseInt(sign+absolutes[i]);    
        }
        int sum =0;
        for(int i=0;i<result.length;i++){
            sum+=result[i];
        }
        return sum;
        
    }
}