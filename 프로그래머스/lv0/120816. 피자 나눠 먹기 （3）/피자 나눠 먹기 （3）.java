class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        if(slice>=n) return pizza;
        while(slice*pizza<n){
            pizza++;
        }
        return pizza;
    }
}