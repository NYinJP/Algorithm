class Solution {
    public String solution(String code) {
        String[] arr = code.split("");
        int mode = 0;
        String result = "";
        
        for(int i=0;i<arr.length;i++){
            // mode가 0 
            if(mode == 0){
                if(arr[i].equals("1")){
                    mode = 1;
                    continue;
                }else{
                    if(i%2 == 0){
                        result +=arr[i];
                        continue;
                    }else{
                        continue;
                    }
                }
            // mode가 1    
            }else{
                if(arr[i].equals("1")){
                    mode = 0;
                    continue;
                }else{
                    if(i%2 != 0){
                        result +=arr[i];
                        continue;
                    }else{
                        continue;
                    }
                }
            }
        }
        return result = result.equals("")?"EMPTY":result;
    }
}