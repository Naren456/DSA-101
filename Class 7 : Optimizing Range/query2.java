
public class query2 {
   
    public static void main(String[] args) {
        //using prefix even count
        int [] arr = {3,1,-2,0,1,2,4,-3,0,5,6};
        int n = arr.length;
        int [] prefix = new int[n];
        if(arr[0]%2==0){
             prefix[0]=1;
        }
        for (int i = 1 ; i< n ;i++)
          if(prefix[i]%2==0){
            prefix[i] = prefix[i-1]+A[i];
        }
    }

}
