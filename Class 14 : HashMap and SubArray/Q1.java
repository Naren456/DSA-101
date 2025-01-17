//Given an array . Find the first non-repeating element.

import java.util.HashMap;

public class Q1 {

    public static void main(String[] args) {
        int[] A ={3,1,2,1,5,6,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            }
            else{
                map.put(A[i], 1);
            }
        }
        for(int i=0;i<A.length;i++){
            if(map.get(A[i])==1){
                System.out.println(A[i]);
                break;
            }
        }
    }
}