class Solution {
    public String solution(String my_string, int n) {
        // "abc1234567890"
        // substring(13-10)
        return my_string.substring(my_string.length()-n);
    }
}