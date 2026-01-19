import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();

        int firstidx = 0;
        boolean leftRightCheck = true;
        int i=0;
        while (i<str_list.length) {
            if (str_list[i].equals("l")) {
                break;
            } else if (str_list[i].equals("r")) {
                list.clear();
                leftRightCheck = false; // r을 만남~
                break;
            }else{
                list.add(str_list[i]);
                firstidx++;
                i++;
            }
        }

        // l이나 r 이 없으면 빈 리스트를 리턴합니다.
        if (list.size() == str_list.length) {
            return new String[]{};
        }
        
        // l 이라면
        if (leftRightCheck) {
            return list.toArray(String[]::new);
        } 
        // r 이라면
        else {
            for (int j=i+1; j < str_list.length; j++) {
                list.add(str_list[j]);
            }
            return list.toArray(String[]::new);
        }
    }
}