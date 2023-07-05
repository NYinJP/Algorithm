class Solution {
    public int[] solution(String[] strlist) {
        
        int count = strlist.length;

        int[] numArr = new int[count];
        for(int i=0;i<count;i++){
            numArr[i] = strlist[i].length();
        }
        return numArr;
    }
}
