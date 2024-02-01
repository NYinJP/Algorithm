class Solution {
    public int[] solution(int[] num_list, int n) {
        int num = num_list.length - n+1; // 배열의 크기
        int[] answer = new int[num]; // 결과 담을 배열 생성
        
        for(int i=n-1,j=0;i<num_list.length;i++){
            answer[j++] = num_list[i];
        }
        return answer;
    }
}