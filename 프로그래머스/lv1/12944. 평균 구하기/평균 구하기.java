import java.util.*;
class Solution {
    public double solution(int[] arr) {
        double avg = Arrays.stream(arr).mapToDouble(x->x).average().getAsDouble();
        return avg;
    }
}