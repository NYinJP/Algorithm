import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int [] A = new int[num2+1];
        for(int i=2;i<=num2;i++){
            A[i] = i;
        }
        for (int i=2;i<=Math.sqrt(num2);i++){
            if(A[i]==0) continue;
            for(int j=i+i;j<=num2;j=j+i){
                A[j] = 0;
            }
        }
        for (int i=num1;i<=num2;i++){
            if(A[i]!=0) System.out.println(A[i]);
        }

    }
}
