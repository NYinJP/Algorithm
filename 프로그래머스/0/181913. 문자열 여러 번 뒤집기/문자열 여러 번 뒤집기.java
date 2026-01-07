import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] temp = my_string.toCharArray();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            list.add(temp[i] + "");
        }

        for (int i = 0; i < queries.length; i++) {

            int swapCount = (queries[i][1] - queries[i][0] +1)/2;

            int count = 0;

            int k=0;

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {

                String temp1 = "";
                String temp2 = ""; // 문자열 거꾸로 뒤집기. 맨 뒤의 값 가져오기

                temp1 = list.get(queries[i][1] - k); // 뒤의 값 b를
                temp2 = list.get(j); //

                list.set(j, temp1); // j는 0
                list.set(queries[i][1] - k, temp2);

                count ++;
                k++;

                if (count == swapCount) {
                    break;
                }
            }


        }

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }

        return result;
    }
}