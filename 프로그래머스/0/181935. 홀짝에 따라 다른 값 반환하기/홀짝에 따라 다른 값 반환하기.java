class Solution {
    public int solution(int n) {
        
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%2==0){ // n이 짝수라면
                if(i%2==0){
                    answer+=i*i;
                }else continue;
                
            }else{
                if(i%2 !=0){
                    answer+=i;
                }else continue;
            }
        }
        return answer;

    }
}