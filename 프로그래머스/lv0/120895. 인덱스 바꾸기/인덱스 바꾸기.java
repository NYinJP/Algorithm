class Solution {
    public String solution(String my_string, int num1, int num2) {

        char[] strChar = my_string.toCharArray();

        char temp = strChar[num1];
        strChar[num1] = strChar[num2];
        strChar[num2] = temp;
        
        String result ="";
        for(int i = 0; i < strChar.length; i++){
            result = result + strChar[i];
        }
        return result;
    }
}