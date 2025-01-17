//Given an Array .Return count of distinct elements in every subarray of sized k.


import java.util.ArrayList;
import java.util.HashMap;

public class Q2{
    public static void main(String[] args) {
        int[] A ={3,2,1,3,5,6,2,5,5,7};
        int k = 4;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<>();


        //creating hashmap till k of Array//
        for (int i=0;i<k;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
        }
       result.add(map.size());
        int s = 0;
        int e =k;


        // now add k++ element and remove s element //
        while(e<A.length){

            //remove s element //
            if(map.get(A[s])==1){
             map.remove(A[s]);
            }
            else{
                map.put(A[s],map.get(A[s])-1);
            }


            //adding e //
            if(map.containsKey(A[e])){
                map.put(A[e],map.get(A[e])+1);
            }
            else{
                map.put(A[e],1);
            }
            result.add(map.size());
            s++;
            e++;
            
        }  
        System.out.println(result);        
}


}
