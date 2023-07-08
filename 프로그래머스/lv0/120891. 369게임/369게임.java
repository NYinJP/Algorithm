class Solution {
    public int solution(int order) {
        char [] orderChars = (order+"").toCharArray();

        int answer = 0;
        for(int i = 0; i < orderChars.length;i++){
            if ((orderChars[i] - '0' ) %3 == 0  && (orderChars[i] - '0' )!= 0) {
                answer ++;
            }
        }
        return answer;
    }
}