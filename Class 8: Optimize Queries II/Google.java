
import java.util.Scanner;



public class Google {
  
    static int[] GoogleQ(int[][] Q ,int A){
          int [] Array = new int [A];
          for (int i= 0 ;i<Q.length;i++){
            int s = Q[i][0];
            int e = Q[i][1];
            int v = Q[i][2];
            Array[s] += v;
            if (e<A-1){
                Array[e+1] -= v;
            }
          }
          int [] prefix = prefixSum(Array);
          return prefix;
    }
    static int [] prefixSum (int [] A){
        int [] prefix = new int[A.length];
        prefix[0] =A[0];
        for (int i = 1 ;i < A.length ;i++){
            prefix[i] = prefix[i-1] + A[i];
        }
        return prefix;
    }
    static void printArray(int [] A){
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }

    public static void main(String[] args) {
      System.out.println("Given an Array size n . given Q of form (s,e,v) for every Query v to all element of array from s to e");
      System.out.print("Size of Array : ");
      Scanner sc =new Scanner(System.in);
      int N  = sc.nextInt();
      System.out.print("Queries No. : ");
      int q = sc.nextInt();
      int [][] Q =new int[q][3];
      for (int i=0;i<q;i++){
        System.out.print("Enter Query "+(i+1)+" : ");
           Q[i][0] =  sc.nextInt();
           Q[i][1] =  sc.nextInt();
           Q[i][2] =  sc.nextInt();             
        }
        int [] finalAnswer = GoogleQ(Q, N);
        System.out.print("Ans : ");
        printArray(finalAnswer);
        sc.close();
        System.out.println();
      }
    
    }

