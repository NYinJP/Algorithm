import java.util.*;
class Solution {
    public int solution(int num) {
        long n = (long)num;
        int index = 0;
        while(n!=1){
            if(index>=500) return -1;
            if(n%2 ==0) {
                n/=2;
                index++;
            }else{
                n=n*3 +1;
                index++;
            }
        } return index;
    }
}