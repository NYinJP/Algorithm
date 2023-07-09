class Solution {
    public int solution(int n) {
        int [] num = new int[n+1];
        for(int i=2;i<=n;i++){
            num[i] = i;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(num[i]==0) continue;
            for(int j = i+i;j<=n;j=j+i){
                num[j] = 0;
            }
        }
        int result = 0;
        for(int i=1;i<=n;i++){
            if(num[i] != 0) result++;
        }
        return result;
    }
}