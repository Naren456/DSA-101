
import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    int size;
    int [] A;
    Array(int size){
        this.size = size ;
        A = new int[size];
    }
    int [] Input(){
          for (int i= 0;i<size;i++){
            A[i] = sc.nextInt();
          }
          return  A;
    }
    int []prefixSum(){
         int [] prefix = new int[size];
         prefix[0] = A[0];
         for (int i=1;i<size;i++){
            prefix[i]= prefix[i-1] + A[i];
         }
         return prefix; 
    }
    void printArray(){
        for (int i=0;i<size;i++){
         System.out.print(A[i]+" ");
        }
    }
}
