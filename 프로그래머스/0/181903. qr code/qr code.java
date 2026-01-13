class Solution {
    public String solution(int q, int r, String code) {
         String result = "";
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                result += code.charAt(i);
            }
            
        }
        return result;
    }
}