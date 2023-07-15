class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String [] strChar = my_string.split("");
        for(int i=0;i<strChar.length;i++){
            answer+=strChar[i].repeat(n);
        }
        
        return answer;
    }
}