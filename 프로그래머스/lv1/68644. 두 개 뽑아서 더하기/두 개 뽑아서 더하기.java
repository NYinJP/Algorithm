import java.util.*
;class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
            arrList.add(numbers[i]+numbers[j]);
            }
        }
        int [] arr = arrList.stream().distinct().sorted().mapToInt(x->x).toArray();
        return arr;
    }
}