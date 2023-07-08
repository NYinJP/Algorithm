class Solution {
    public int solution(String my_string) {
                my_string = my_string.replaceAll("[a-z|A-Z]","");
        char [] strChar = my_string.toCharArray();

        int result =0;
        for (int i = 0; i < strChar.length; i++) {
            result += strChar[i] -'0';
        }
        return result;
    }
}