import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> arrList = new ArrayList<>();
        int index = 0;
        for(int i=0;i<finished.length;i++){
            if(!finished[i]) {
                arrList.add(todo_list[i]);
                index++;
            }
        
        }
        
        String[] answer = arrList.toArray(new String[index]);
        return answer;
    }
}