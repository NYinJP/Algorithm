import java.util.*;
class Solution {
    public long solution(String numbers) {
        List<String> list =List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        String str = "";
        for (int i = 0; i < numbers.length();) {
            if (list.contains(numbers.substring(i, i + 3))) {
                str += list.indexOf(numbers.substring(i, i + 3));
                i = i + 3;
            } else if (list.contains(numbers.substring(i, i + 4))) {
                str += list.indexOf(numbers.substring(i, i + 4));
                i = i + 4;
            } else if (list.contains(numbers.substring(i, i + 5))) {
                str += list.indexOf(numbers.substring(i, i + 5));
                i = i + 5;
            }
        }
        return Long.parseLong(str);
    }
}