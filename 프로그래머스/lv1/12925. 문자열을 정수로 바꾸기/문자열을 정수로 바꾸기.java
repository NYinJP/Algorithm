class Solution {
    public int solution(String s) {
        String result = "";
        char [] strChar =s.toCharArray();

        if(strChar[0] =='-' || strChar[0] == '+'){
            for (int j = 1; j < strChar.length; j++) {
                result +=strChar[j];
            }
            result = (strChar[0] == '-') ? '-' + result : result;

        }else{
            for(int i = 0; i<strChar.length;i++){
                result +=strChar[i];
            }
        }
        return Integer.parseInt(result);
    }
}