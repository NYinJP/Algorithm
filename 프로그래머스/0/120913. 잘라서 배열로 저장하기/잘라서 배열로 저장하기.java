class Solution {
    public String[] solution(String my_str, int n) {
        // 몫
        int number = my_str.length() / n;
        // 나머지 보정
        if (my_str.length() % n != 0) {
            number ++;
        }
        
        String[] result = new String[number];

        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                result[i] = my_str.substring(i * n);
            }
            else{
                result[i] = my_str.substring(i * n, (i + 1) * n);
            }
        }
        return result;
    }
}