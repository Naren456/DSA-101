//Check_if_there_exist_a_subarray_with_Sum_Equal_to_0

import java.util.HashMap;

public class  Q3{
    public static void main(String[] args) {
        int[] A = {7,-3,-2,1,-3,4,5,10,-7};
        //build prefixArray
        int[] PS = new int[A.length];
        PS[0] = A[0];
        for(int i=1;i<A.length;i++){
            PS[i] = PS[i-1] + A[i];
        }
        //count duplicates in PS using HashMap
       
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<A.length;i++){
            if(map.containsKey(PS[i])){
               map.put(PS[i],map.get(PS[i])+1);
            }
            else{
               map.put(PS[i],1);
            }
        }
        int mod = 1000000007;
        int count = 0;
     for (int key:map.keySet()){
        if(map.get(key)>1){
            int n = map.get(key);
            int ans = n*(n-1)/2;
            count += ans;
            count %= mod;
        }
     }
     if(map.containsKey(0)){
        count += map.get(0);
     }
System.out.println("NO of subArrays:");
System.out.println(count);
    }   
}
