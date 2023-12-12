class Solution {
    public int[] solution(int[] num_list) {
        
        // 입력값으로 들어온 배열보다 원소 하나 더 많은 배열 생성하기
        int [] num_list_return = new int[num_list.length + 1];
        
        // 배열 하나씩 접근하면서
        for(int i=0;i<num_list.length;i++){
            num_list_return[i] = num_list[i];
            // 마지막 원소일때,
            if(i == num_list.length -1){
                num_list_return[i+1]=num_list[i]>num_list[i-1]?num_list[i]-num_list[i-1]:num_list[i]*2;
            }
        }
        // 반환
        return num_list_return;
    }
}