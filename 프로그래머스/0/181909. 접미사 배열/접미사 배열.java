import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        int count = my_string.length();
        // 문자 배열 만들기
        char[] strArr = my_string.toCharArray();
        // 반복문
        for (int i = 0; i < strArr.length; i++) {
            list.add(my_string.substring(i));
        }

        Collections.sort(list); // 사전순 정렬
        // 문자열로 반환
        return list.stream().toArray(String[]::new);
    }
}