class Solution {
    public int solution(int[] array) {
        String str = "";
        for(int i=0;i<array.length; i++){
            str+=array[i];
        }
        char [] strChar = str.toCharArray();
        int result =0;
        for (int i = 0; i < strChar.length; i++) {
            if(strChar[i] =='7') result ++;
        }
        return result;
    }
}