class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        for(int i=1;i<=num_list.length;i++){
            if(i%2 != 0){
                odd+=num_list[i-1];
            }else{
                even+=num_list[i-1];
            }
        }
        return even>=odd?even:odd;
    }
}