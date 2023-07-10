class Solution {
    public int solution(int n) {
        // 순서쌍의 개수 리턴하기
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) index++;
        }return index;
    }
}