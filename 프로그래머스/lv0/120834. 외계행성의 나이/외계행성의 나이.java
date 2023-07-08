class Solution {
    public String solution(int age) {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j'};
        String strAge = age+"";
        char[] strChar = strAge.toCharArray();
        String result = "";

        for(int i=0;i<strAge.length(); i++){
            int index = strChar[i] -'0';
            result += alpha[index];
        }
        return result;
    }
}