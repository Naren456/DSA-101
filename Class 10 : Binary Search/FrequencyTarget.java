
import java.util.*;
public class FrequencyTarget {
  
    static int[] createArray(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of array");
     int[] A  = new int[n];
     for (int i=0 ;i<n;i++){
        A[i]=sc.nextInt();
     }
     return A;
    }
    static int leftMost(int[] A ,int target ,int s ,int e){
        int leftmost = -1;
        while (s<=e){
            int mid = (s+e)/2;
            if(A[mid]==target){
                leftmost = mid;
                e =mid-1;
            }
            else if (A[mid]>target){
                e =mid-1;
            }
            else{
                s =mid+1;
            }
        }
        return leftmost;
          
    }
      static int RightMost(int[] A ,int target ,int s ,int e){
        int rightmost = -1;
        while (s<=e){
            int mid = (s+e)/2;
            if(A[mid]==target){
                rightmost = mid;
                s =mid+1;
            }
            else if (A[mid]>target){
                e =mid-1;
            }
            else{
                s =mid+1;
            }
        }
      return rightmost;     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :  ");
        int n = sc.nextInt();
        int[] array = createArray(n);
        
     for (int i=0;i<3;i++){
        System.out.println("Enter the target value for floor :");
        int val = sc.nextInt();
        int freq = RightMost(array, val, 0, n)  - leftMost(array, val, 0, n) + 1;
        System.out.println("frequency "+val+" :"+ freq);
     }
    }
}
