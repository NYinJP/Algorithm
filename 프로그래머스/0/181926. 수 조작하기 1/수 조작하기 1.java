class Solution {
    public int solution(int n, String control) {
        
        String [] arr = control.split("");
        int answer = n;
        
        for(String str : arr ){
            
            if(str.equals("w")) answer+=1;
            else if(str.equals("s")) answer -=1;
            else if(str.equals("d")) answer +=10;
            else answer -=10;
            
            }
        return answer;
    }
}