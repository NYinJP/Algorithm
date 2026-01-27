class Solution {
    public int solution(int i, int j, int k) {
        int result = 0;
        for (int p = i; p <= j; p++) { // 1,2,3,...,10,11,12,13
            for (int n = 0; n < String.valueOf(p).length(); n++) {
                if ((String.valueOf(p).charAt(n) + "").equals(k + "")) {
                    result++;
                }
            }
        }
        return result;
    }
}