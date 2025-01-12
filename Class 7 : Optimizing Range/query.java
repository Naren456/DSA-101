import java.util.Scanner;

public class query {
    static int [] input(int n){
      Scanner sc = new Scanner(System.in);
        int [] A = new int [n];
      for (int i = 0 ;i < n;i++){
         A[i] = sc.nextInt();
      }
      return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] A = input(n);
        int Q = sc.nextInt();
        for (int q = 0 ; q<Q ; q++){
          int s = sc.nextInt();
          int e = sc.nextInt();
          int sum = 0;
          for (int i=s ; i<=e ;i++){
            sum += A[i];
          }
          System.out.println(sum);
        }

    }
}
