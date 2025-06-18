class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (alp.equals(String.valueOf(my_string.charAt(i)))) {
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            }else
                answer += String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
}