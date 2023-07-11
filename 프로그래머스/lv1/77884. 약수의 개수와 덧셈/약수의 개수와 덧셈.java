class Solution {
    public int solution(int left, int right) {
        
        // 약수 개수 저장할 배열
        int [] arr = new int[right-left+1];
        // 두 매개변수 사이의 정수 저장할 배열
        int [] check = new int[right-left+1];
        
        // 배열 초기화
        for(int i=0;i<check.length;i++){
            check[i] = left+i;
        }
        
        // 약수 개수 저장할 변수
        int index = 0;
        
        
        for(int i = 0 ; i < arr.length ; i++){
            index = 0;
            for(int j=1 ; j <= check[i] ; j++){
                if(check[i]%j == 0) index++;
                else continue;
            }
            arr[i] = index;
        }
        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0 ) check[i]*=(-1);
            sum+=check[i];
        }
        return sum;
    }
}