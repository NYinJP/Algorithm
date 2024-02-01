class Solution {
    public int solution(int a, int b) {
        String num1 = a+""+b;
        String num2 = String.valueOf(a*b*2);
        
        int realNum1 = Integer.parseInt(num1);
        int realNum2 = Integer.parseInt(num2);
        
        if(realNum1==realNum2 || realNum1>realNum2) return realNum1;
        else return realNum2;

    }
}