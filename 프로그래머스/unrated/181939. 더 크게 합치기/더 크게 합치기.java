class Solution {
    public int solution(int a, int b) {
        // String aStr = a+"";
        // String bStr = b+"";
        // String aConcatB = aStr + bStr;
        // String bConcatA = bStr + aStr;
        
        int ab = Integer.parseInt(a+""+b);
        int ba = Integer.parseInt(b+""+a);
        return ab>ba? ab:ba;
        
    }
}