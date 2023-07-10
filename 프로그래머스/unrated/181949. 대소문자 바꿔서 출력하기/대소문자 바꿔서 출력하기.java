import java.util.*;

public class Solution {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        String s= sc.next();
        char[] ss = s.toCharArray();
        String result = "";
        for(int i=0;i<ss.length ; i++){
            if(ss[i]>='a'&& ss[i] <= 'z') ss[i] = (char)((int)ss[i]-32);
            else ss[i] = (char)((int)ss[i]+32);
            result +=ss[i];
        }
        System.out.println(result);
        
    }
}