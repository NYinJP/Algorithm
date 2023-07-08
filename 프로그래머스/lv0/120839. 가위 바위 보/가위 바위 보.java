class Solution {
    public String solution(String rsp) {
        char [] rspArr = rsp.toCharArray();
        String result ="";
        for(int i = 0; i < rspArr.length; i++){
            if(rspArr[i]=='0') result+='5';
            else if(rspArr[i] == '2') result += '0';
            else result +='2';
        } return result;

    }
}