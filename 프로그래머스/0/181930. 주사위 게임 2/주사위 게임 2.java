class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // 세 숫자가 모두 같은 경우
        if(a==b && b==c){
            
            int n1 = a+b+c;
            int n2 = a*a + b*b + c*c;
            int n3 = a*a*a + b*b*b + c*c*c;
            
            answer = n1*n2*n3;
            
        }else if(a!=b && b!=c && a!=c){
        
            answer = a+b+c;    
        }else{
            int n1 = a+b+c;
            int n2 = a*a + b*b + c*c;
            
            answer = n1*n2;
            
        }
        return answer;
    }
}