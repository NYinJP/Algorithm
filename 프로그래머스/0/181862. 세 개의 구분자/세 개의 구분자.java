import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace('a', ' ');
        myStr = myStr.replace('b', ' ');
        myStr = myStr.replace('c', ' ');

        String[] arr = myStr.split(" ");

        List<String> list = new ArrayList<>();

        for (String p : arr) {
            if(!p.isEmpty()) list.add(p);
        }

        if (list.size() == 0) {
            return new String[]{"EMPTY"};
        } else {
            return list.toArray(String[]::new);
        }
    }
}