

public class IndeX {
   
    public static  int solve(int[] A) {
        int n = A.length;
        if (n==1)
        return 1;

       long[] prefix = new long[n];
       long[] suffix = new long[n];
       prefix[0]=A[0];
       for(int i = 1;i<n;i++){
           prefix[i] = prefix[i-1]+A[i];
           System.out.print(prefix[i]+" ");
       }
       System.out.println();
       suffix[n-1] = A[n-1];
       for (int i= n-2 ;i>=0 ;i--){
           suffix[i]=suffix[i+1]+A[i];
           System.out.print(suffix[i]+" ");
       }
       System.out.println();
       for (int i = 0;i < n ;i++){
           if (prefix[i] == suffix[i]){
               return i;
           }
       }
       return -1;

    }
    public static void main(String[] args) {
        int [] A = {-7,1,5,2,-4,3,0};
        System.out.println(solve(A));
    }
}



