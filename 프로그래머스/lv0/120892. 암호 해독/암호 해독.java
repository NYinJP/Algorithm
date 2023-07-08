class Solution {
    public String solution(String cipher, int code) {
        String [] cipherArr = cipher.split("");
        
        String result = "";
        int i=1;
        while (i*code <= cipherArr.length){
            result += cipherArr[i*code -1];
            i++;
        }
        return result;
    }
}