class Solution {
    public int solution(String my_string, String is_suffix) {
        int checkNum = my_string.length()-is_suffix.length();
        if(checkNum<0) return 0;
        String check1 = my_string.substring(checkNum);
        return (check1.equals(is_suffix))?1:0;
        
    }
}