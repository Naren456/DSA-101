
import java.util.Scanner;

public class MaxSumOfsizeK {
//Given  an Array . Return the maxSum of any SubArray of size K.//

//Using PrefixSum//
static int MaxSubArray (int[]A, int B){
     
       int [] prefixSum = prefixSum(A);
       int Sum = prefixSum[B-1];
       int s = 0;
       int e = B;
       while (e<A.length-1){
        int tempt = prefixSum[e] - prefixSum[s];
        e++;
        s++;
        if(tempt > Sum){
            Sum = tempt;
        } 
       }//Time Complexity : O(N)+O(N)= O(N);
        //Space Complexity : O(N)  Builder Another Array;
       return  Sum;
}  
// Using Sliding Windows//

static int MaxSubArrayOptimize(int [] A,int B){
    int sum = 0;
    for (int i=0;i<B;i++){
        sum += A[i];
    }
    int max = sum;
    int s = 0;
    int e = B;
    while(e<A.length){
        sum = sum -A[s] +A[e];
        max = Math.max(sum, max);
        e++;
        s++;
    }//Time Conplexity O(N)
     // Space Complexity O(1)
    return max;
}

static int [] prefixSum (int [] A){
    int [] prefix = new int[A.length];
    for (int i = 1 ;i < A.length ;i++){
        prefix[i] = prefix[i-1] + A[i];
    }
    return prefix;
}
 static int[] Read (int N){
    Scanner sc = new Scanner(System.in);
        int [] A =  new int[N];
        for (int i = 0 ;i < N ; i++){
            A[i] = sc.nextInt();
        }
        return A;
 }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.err.println("Given  an Array . Return the maxSum of any SubArray of size K");
    System.out.print("Enter No. of Elements : ");
    int N = sc.nextInt();
    System.out.print("Enter K : ");
    int K = sc.nextInt();
    System.out.print("Enter Elements : ");
    int [] Array = Read(N);
    int MaxSumK = MaxSubArrayOptimize(Array, K);
    System.out.print("MaxSum of SubArray of length "+K+" : ");
    System.out.println(MaxSumK);
}    
}
