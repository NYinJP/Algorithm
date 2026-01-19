class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 쿼리 수만큼 반복하기
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j] +=1;
            }
        }
        return arr;
    }
}