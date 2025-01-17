// given an array . find the duplication of pair
public class HahMap {
      public static int Combination(int n ,int r){

      }
       public static void main(String[] args) {
        int[] A = {3,5,2,3,6,5,5,2,3};
        int count = 0;
        HahMap<Integer,Integer> map = new HahMap<Integer,Integer>();
          for (int i = 0 ;i < map.size();i++){
            if(map.containsKey(A[i])){
                count += map.get(A[i]);
                map.put(A[i],map.get(A[i])+1);
                
            }
            else{
                map.put(A[i],1);
            }
          }
    

       }    
}
