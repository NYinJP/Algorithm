import java.util.*;
class Solution {
    public double solution(int[] arr) {
        double avg = Arrays.stream(arr).average().getAsDouble();
        return avg;
    }
}