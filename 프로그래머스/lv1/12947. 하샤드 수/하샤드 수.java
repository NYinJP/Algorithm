class Solution {
    public boolean solution(int x) {
        int number = 0;
        char [] numArr = (x+"").toCharArray();
        for(int i=0;i<numArr.length;i++){
            number+=numArr[i]-'0';
        }
        if(x%number == 0 ) return true;
        return false;
    }
}