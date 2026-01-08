import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        List<String> list = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            list.add(String.valueOf(c));
        }


        for (int i = 0; i < queries.length; i++) {

           
            int swapCount = (queries[i][1] - queries[i][0] +1)/2;

            int count = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {

                String temp1 = "";
                String temp2 = ""; 

                temp1 = list.get(queries[i][1] - count);
                temp2 = list.get(j);

                list.set(j, temp1); 
                list.set(queries[i][1] - count, temp2); 

                count ++;

              
                if (count == swapCount) {
                    break;
                }
            }
        }

        return list.stream().collect(Collectors.joining());
    }
}