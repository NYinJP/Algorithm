class Solution {
    public int solution(int[] num_list, int n) {
        int result = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i] - n == 0){
                result =1;
                break;
            }
            result =0;
            
        }
        return result;
    }
}