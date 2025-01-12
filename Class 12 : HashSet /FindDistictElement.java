import java.util.HashSet;

public class FindDistictElement {
    static int solver(int[]A){
        HashSet<Integer> set  = new HashSet<Integer>();
        for (int i=0;i<A.length;i++){
            set.add(A[i]);
        }
        return set.size();
    }
      public static void main(String[] args) {
              int[] A= {1,2,3,4,8,8,9,8,8};
              System.out.println(solver(A));    
      }    
}
