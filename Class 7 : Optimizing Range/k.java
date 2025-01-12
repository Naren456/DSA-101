import java.util.Scanner;

public class k {
    static int Sum(int [] A){
        int sum = 0;
        int n = A.length;
        for (int i=0;i<A.length;i++){
            sum += A[i]*(n-i)*(i+1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] A = new int [4];
        for (int i=0;i<4;i++){
            A[i] =sc.nextInt();
        }
        int sum =Sum(A);
        System.out.println(sum);
    }
}
