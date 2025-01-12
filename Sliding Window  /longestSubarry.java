import java.util.Scanner;

public class longestSubarry {
    // create array //
    static int[] createArray(int n){
        Scanner sc =new Scanner(System.in);
       int[] A = new int[n];
       for (int i= 0;i<n;i++){
        A[i] = sc.nextInt();
       }
       return A;
    }
    // longest subArray with sum <= k
    static int MaxSum(int[] A , int k){
            int max = 0;
            int size = 0;
            int n = A.length;
            for (int i=0;i<n;i++){
                 int sum=0;
                for (int j=i;j<n;j++){
                    sum += A[j];
                    if(sum<k && sum >max){
                        max= sum;
                        size = j-i + 1;
                    }
                }
            }
            System.out.println("size"+size);
            return max; 
    }
    // main //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A = createArray(n);
        int k  = sc.nextInt();
        int max  = MaxSum(A,k);
        System.out.println(max);
        
    }    
}
