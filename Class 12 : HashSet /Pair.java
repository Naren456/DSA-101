import java.util.HashSet;

public class Pair {
    public static void main(String[] args) {
        int [] A ={0,5,8,9,10,25,45};
        int K = 25;
        HashSet<Integer> set = new HashSet<Integer>();
      
        boolean p= false;
        for (int i=0 ;i<A.length;i++){
            if(set.contains(K-A[i])){
                 p= true;
            }
            else{
               set.add(A[i]);
            }
        }
        System.out.println(p);
    }
}
