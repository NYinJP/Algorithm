class Solution {
    public int[] solution(int[] arr, int[] query) {int firstidx = 0;
        int endidx = arr.length -1;

        for (int i = 0; i <query.length; i++){

            // 인덱스가 짝수라면
            if (i % 2 == 0) {
                endidx = firstidx + query[i];
            }

            // 인덱스가 홀수라면
            else{
                firstidx = firstidx + query[i];
            }
        }


        int[] result = new int[endidx - firstidx +1];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[firstidx+i];
        }

        return result;
    }
}