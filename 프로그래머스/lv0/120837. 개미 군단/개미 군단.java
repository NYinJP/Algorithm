import java.util.*;
class Solution {
    public int solution(int hp) {
        int e = 0 ; int j=0 ; int b =0;
        while(hp>0){
            if(hp>=5){
                j = hp/5;
                hp -= (j*5);
            }else if(hp>=3){
                b = hp/3;
                hp -= (b*3);
            }else{
                e++;
                hp--;
            }
        }
        return e+b+j;
    }
}