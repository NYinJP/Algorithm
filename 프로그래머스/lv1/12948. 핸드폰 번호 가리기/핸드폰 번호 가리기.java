class Solution {
    public String solution(String phone_number) {
        String[] real = phone_number.split("");
        String answer="";
        for(int i=0;i<real.length;i++){
            if(i<real.length-4) real[i] = "*";
            answer+=real[i];
        }
        return answer;
    }
}