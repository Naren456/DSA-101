import java.util.Scanner;

public class Floor {
  
     static int floor(int []A ,int target,int s ,int e ){
        int small = 0;
        while (s<=e){
            int mid = (s + e)/2;
          
            if (A[mid]==target){
                return A[mid];
            }
            else if (A[mid]>target){
                e  = mid - 1;
            }
            else if (A[mid]<target){
               
                if (A[mid]>small){
                      small =A[mid];
                }
                s = mid + 1;
            }
        }
        return small;
     } 
      static int[] createArray(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of array");
     int[] A  = new int[n];
     for (int i=0 ;i<n;i++){
        A[i]=sc.nextInt();
     }
     return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :  ");
        int n = sc.nextInt();
        int[] array = createArray(n);
        
     for (int i=0;i<3;i++){
        System.out.println("Enter the target value for floor :");
        int val = sc.nextInt();
        int index = floor(array, val, 0, n);
        System.out.println("floor of "+val+" :"+index);
     }
    }
}
