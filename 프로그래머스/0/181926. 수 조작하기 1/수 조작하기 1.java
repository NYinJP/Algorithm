class Solution {
    public int solution(int n, String control) {
        
        String [] arr = control.split("");
        int answer = n;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i].equals("w")) answer+=1;
            else if(arr[i].equals("s")) answer -=1;
            else if(arr[i].equals("d")) answer +=10;
            else answer -=10;
            
            }
        return answer;
    }
}