import java.util.ArrayList;

public class SubArray { 
   static  void printSubArray(int[] A){
        for (int i = 0 ;i < A.length;i++){
            for (int j = i; j<A.length ;j++){
                for (int k= i ; k<=j ;k++){
                     System.out.print(A[k] +" ");
                }
                System.out.println();
            }
        }
    }
    static int printSubArray2(int [] A){
          int i=0;
          int count = 0;
        while ( i<A.length){
            int sum  = 0;
            //ArrayList<Integer> As  = new ArrayList<>();
            for (int k = i ; k < A.length ;k++){
              //   As.add(A[k]);
                 //System.out.println(As);
                 sum += A[k];
                
            }
            i++;
            count += sum;
            System.out.println(count);
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr =new int []{1,2,3,4,5};
        System.out.println(printSubArray2(arr));

    }
}
