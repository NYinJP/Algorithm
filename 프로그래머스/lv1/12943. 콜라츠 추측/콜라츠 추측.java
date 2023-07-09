import java.util.*;
class Solution {
    public int solution(int num) {
        long num1 = num;
        int index = 0;
        while(num1!=1){
            if(index>=500) return -1;
            if(num1%2 ==0) {
                num1/=2;
                index++;
            }else{
                num1=num1*3 +1;
                index++;
            }
        } return index;
    }
}