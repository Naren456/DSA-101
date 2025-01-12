import java.util.Scanner;

public class ConstantWindow {
    static int MaxSum(int[] A , int k){
        int maxSum = 0;
        int n =A.length;
        int l = 0;
        int r = k-1;
        for (int i=l;i<=r;i++){
            maxSum += A[i];
        }
        int sum = maxSum;
         while (r < n-1) {
            sum -= A[l];
            l++;
            r++;
            sum += A[r];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt(); 
        int[] A = new int[n];
        for (int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }

        System.out.println(MaxSum(A, k));
    }
}
