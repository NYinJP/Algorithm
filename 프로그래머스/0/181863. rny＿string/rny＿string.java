class Solution {
    public String solution(String rny_string) {
        char[] strArr = rny_string.toCharArray();
        String [] strArr2 = new String[rny_string.length()];
        for(int i=0;i<strArr2.length;i++){
            strArr2[i] = strArr[i]+"";
        }
        String result = "";
        for(int i=0;i<strArr2.length;i++){
            if(strArr2[i].equals("m")){
                strArr2[i] = "rn";
            }
            result +=strArr2[i];
        }
        return result;
    }
}