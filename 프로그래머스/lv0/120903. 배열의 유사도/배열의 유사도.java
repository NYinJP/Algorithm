import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        for(int i=0;i < s1.length; i++){
            hashMap.put(i, s1[i]);
        }
        int result =0;
        for(int i=0;i< s2.length;i++){
            if(hashMap.containsValue(s2[i])){
                result++;
                continue;
            }
        }
        return result;
    }
}