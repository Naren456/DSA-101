import java.util.Scanner;

public class IEveOdd{
    static int[] inputArray(int n){
        Scanner sc =new Scanner(System.in);
        int[] Array = new int[n];
        for (int i= 0;i<n;i++){
            Array[i] = sc.nextInt();
        }
        return Array;
    }
    static int solve(int[] A){
        int n =A.length;
        int[] PSe = new int[n];
        int[] PSo = new int[n];
        PSe[0] = A[0];
        for (int i=2;i<n;i=i+2){
            PSe[i-1] =PSe[i-2];
            PSe[i] = PSe[i-1] +A[i];
        }
        if(n%2==0){
            PSe[n-1] =PSe[n-2];
        }
        printArray(PSe);
        PSo[1] =A[1];
        for (int i=3;i<n;i=i+2){
            PSo[i-1] =PSo[i-2];
            PSo[i] = PSo[i-1] +A[i];
        }
        if(n%2!=0){
         PSo[n-1]=PSo[n-2];    
        }
        printArray(PSo);
      return n;
     }
     static void printArray(int [] A){
        int n =A.length;
        for (int i = 0;i < n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = inputArray(n);
        int ans =solve(A);

    }
}