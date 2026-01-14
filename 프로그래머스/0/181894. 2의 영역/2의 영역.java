class Solution {
    public int[] solution(int[] arr) {
        
        // 필요한 변수
        int firstidx = 0;
        int lastidx = arr.length -1;
        int resultStart = 0;
        int resultEnd = 0;
        boolean startFlag = true;
        boolean endFlag = true;

        // 과정
        while (
                firstidx != lastidx
                && (startFlag || endFlag)
                && (firstidx<arr.length-1 && lastidx>0)) {

            if (arr[firstidx] != 2) {
                firstidx++;
            } else if (arr[firstidx] == 2) {
                resultStart = firstidx;
                startFlag = false;
            }
            if (arr[lastidx] != 2) {
                lastidx--;
            } else if (arr[lastidx] == 2) {
                resultEnd = lastidx;
                endFlag = false;
            }
        }

        // 결과 반환
        if (firstidx == lastidx) {
            if (arr[firstidx] == 2) {
                return new int[]{2};
            }
            return new int[]{-1};
        }
        if (firstidx == arr.length - 1 && lastidx == 0) {
            return new int[]{-1};
        }

        int[] result = new int[resultEnd - resultStart + 1];
        for (int i = resultStart; i <= resultEnd; i++) {
            result[i - resultStart] = arr[i];
        }
        return result;
    }
}