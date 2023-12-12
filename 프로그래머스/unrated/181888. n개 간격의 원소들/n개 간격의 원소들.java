class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = num_list.length%n ==0? num_list.length/n : num_list.length/n+1;
        // 결과 저장할 배열 선택
        int [] answer = new int[count];
        
        // 입력값으로 들어온 배열 반복
    
        for(int i=0,j=0;i<num_list.length;i+=n,j++){
            answer[j] = num_list[i];
        }
        return answer;
    }
}