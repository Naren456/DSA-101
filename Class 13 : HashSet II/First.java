import java.util.HashSet;

public class First {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        int[] A = {3,1,5,2,3,3,1,2,9};
        for(int i=0;i<A.length;i++){
            if(set1.contains(A[i])){
                System.out.println(A[i]);
                break;
            }
            else{
                set1.add(A[i]);
            }
        }
    }
}
