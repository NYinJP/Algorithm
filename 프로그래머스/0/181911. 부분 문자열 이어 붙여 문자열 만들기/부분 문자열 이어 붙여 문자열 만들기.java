class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
                String result = "";

        for (int i = 0; i < parts.length; i++) {

            String temp = "";
            char[] tempChar = my_strings[i].toCharArray();

            for (int j = parts[i][0]; j <= parts[i][1]; j++) {
                temp += tempChar[j];
            }
            result +=temp;
        }
        return result;
    }
}