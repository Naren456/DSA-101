import java.util.HashMap;

public class pairsum {
    public static void main(String[] args) {
        int[] A= {2,3,7,5,4,5,6,8,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int k = 10;
        int ans =0;
        for (int i=0;i<A.length;i++){
            if(map.containsKey(k-A[i])){
                ans += map.get(k-A[i]);
            }
          if (map.containsKey(A[i])){
            
            map.put(A[i],map.get(A[i])+1);
          }
          else{
            map.put(A[i], 1);
          }
        }
        System.out.println(ans);
    }
}
