class Solution {
    public int[] solution(int n, int k) {
        int number = n/k;
        int[] answer = new int[number];
        
        for(int i=1,j=0;i<=number;i++){
            answer[j++] = i*k;
        }
        return answer;
    }
}