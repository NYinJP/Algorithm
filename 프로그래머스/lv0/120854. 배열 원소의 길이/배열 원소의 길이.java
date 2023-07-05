class Solution {
    public int[] solution(String[] strlist) {
//        N 입력받기
//        Scanner sc = new Scanner(System.in);
//        String[] strlist = {"we","are","love"};
        
        int count = strlist.length;

        int[] numArr = new int[count];
        for(int i=0;i<count;i++){
            numArr[i] = strlist[i].length();
        }
        return numArr;
        //System.out.println(Arrays.toString(numArr));
    }
}