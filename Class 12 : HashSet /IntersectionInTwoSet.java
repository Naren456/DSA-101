// Give two array .find the intersection of them. 

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionInTwoSet {
    //Using Hashset//
    static ArrayList<Integer> findIntersection(int[]A,int[]B){
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> ans  = new ArrayList<Integer>();
        for (int i=0;i<A.length;i++){
            set.add(A[i]);
        }
        for (int i=0;i<B.length;i++){
            if(!set.contains(B[i])){
                ans.add(B[i]);  
            }
        }
        return ans;
    }
    //Using Binary Search //
    public static void main(String[] args) {
    int [] A= {3,9,11,12,1,3,9,11,7};
    int [] B ={9,7,17,13,3,6,5};
    System.out.println(findIntersection(A,B));
     }    
}
