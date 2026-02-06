import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        if (balls == share || share ==0) {
            return 1;
        }

        long under = balls - share;
        BigInteger result = BigInteger.ONE;
        long i = 1;

        while (i <= under) {
            result = result.multiply(BigInteger.valueOf(i));
            i++;
        }
        BigInteger answer = BigInteger.ONE;
        long k = 1;
        i = 0;

        while (k <= under) {
            answer = answer.multiply(BigInteger.valueOf(balls - i));
            k++;
            i++;
        }

        BigInteger finalResult = answer.divide(result);
        return finalResult.intValue();
    }
}