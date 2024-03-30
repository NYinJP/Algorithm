class Solution {
    public String solution(String myString) {
        String [] arr = myString.split("");
        String result = "";
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("a") || arr[i].equals("A")){
                arr[i] = "A";
            }else{
                arr[i] = arr[i].toLowerCase();
            }
            result +=arr[i];
        }
        return result;
    }
}