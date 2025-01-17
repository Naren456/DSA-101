import java.util.HashMap;

public class Q4 {

    public static void main(String[] args) {
        int[] A = {7,-3,-2,1,-3,4,5,-5,-4};
        //build prefixArray
        int[] PS = new int[A.length];
        PS[0] = A[0];
        for(int i=1;i<A.length;i++){
            PS[i] = PS[i-1] + A[i];
        }
        //find max Length array //
       int max=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<A.length;i++){
            if(PS[i]==0){
                max= Math.max(max,i+1);
            }
            else if(map.containsKey(PS[i])){
            max = Math.max(max,i-map.get(PS[i])+1);
           }
           else{
            map.put(PS[i],i);
           }
        }
       

        System.out.println(max);
        
        
        
    }
}