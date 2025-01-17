// given an array return the minimum diff b/w index of any 2 duplicates //

import java.util.HashMap;
import java.util.*;
public class MinDistance {
     public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int[] A= {3,5,2,3,6,5,5,2,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
              int firstindex = i;
              int secondindex = map.get(A[i]);
              int diff = Math.abs(firstindex - secondindex);
              if(diff>0 && diff<min){
                   min =diff;
              }
              map.put(A[i],i);
            }
            else{
                map.put(A[i],i);
            }
        }
        System.out.println(min);
     }
}
