class Solution {
    public String solution(String my_string, int s, int e) {
        int count = (s + e + 1) / 2;
        char[] arr = my_string.toCharArray();

        int k = 0;
        for (int i = s; i <= e; i++) {
            char temp = my_string.charAt(i);
            char temp2 = my_string.charAt(e - k);

            arr[i] = temp2;
            arr[e - k] = temp;

            k++;

            if (k == count) {
                break;
            }
        }

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }
}