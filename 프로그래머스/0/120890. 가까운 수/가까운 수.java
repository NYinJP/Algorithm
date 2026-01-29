import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int[] arrResult = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrResult[i] = array[i] - n;
        }

        int min = 100;
        int count = 0;
        int result = 0;
        for (int i = 0; i < arrResult.length; i++) {
            if (min > Math.abs(arrResult[i])) {
                min = Math.abs(arrResult[i]);
                result = arrResult[i];
                count = i; // 해당 인덱스 값 저장하기
            } else if (min == Math.abs(arrResult[i])) {
                // 더 작은 값 저장
                min = Math.abs(arrResult[i]);
                result = arrResult[count] > arrResult[i] ? arrResult[i] : arrResult[count];
                count = arrResult[count] > arrResult[i] ? i : count;
            }

        }
        return result + n;
    }
}