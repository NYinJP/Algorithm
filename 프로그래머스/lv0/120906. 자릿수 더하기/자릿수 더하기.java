class Solution {
    public int solution(int n) {
        String num = n+"";
        char [] numArr = num.toCharArray();
        int answer = 0;
        for(int i = 0; i < numArr.length; i++){
            answer += numArr[i]-'0';
        }
        return answer;
    }
}