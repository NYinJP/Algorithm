class Solution {
    
    private static int dfs(int[] numbers, int index, int currentSum, int target){
        if(index == numbers.length){
            return currentSum==target?1:0;
        }
        
        int add = dfs(numbers, index+1,currentSum + numbers[index] ,target);
        int sub = dfs(numbers, index+1, currentSum - numbers[index], target);
        
        return add + sub;
    }
    public int solution(int[] numbers, int target) {
        
        return dfs(numbers, 0,0,target);        
    }
}