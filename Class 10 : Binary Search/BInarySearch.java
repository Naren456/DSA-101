import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.Scanner;

public class BInarySearch {
    static int[] createArray(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of array");
     int[] A  = new int[n];
     for (int i=0 ;i<n;i++){
        A[i]=sc.nextInt();
     }
     return A;
    }
    static void printArray(int[] A){
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();;
    }
    static int SearchValue(int[] A ,int target, int start, int end){
        int mid = (start+end)/2;
     if (start<=end && start <= A.length-1 ){   
        if (target == A[mid]){
            return mid;
        }
        else if (A[mid]>target){
            end =mid -1;
        }
        else if (A[mid]<target){
            start = mid +1; 
        }
        else if (end == start){
            return -1;
        }
    }
        return SearchValue(A, target, start, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :  ");
        int n = sc.nextInt();
        int[] array = createArray(n);
        Arrays.sort(array);
        printArray(array);
        System.out.println("Enter the target value :");
        int val = sc.nextInt();
        int index = SearchValue(array, val, 0, n);
        System.out.println(index);
    }
}