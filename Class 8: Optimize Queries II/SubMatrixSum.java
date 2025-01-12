import java.util.Scanner;

public class SubMatrixSum {
    //this function will give our result //
   static int [] SubMatrixSumSolver(int [][] A,int [] B ,int []C ,int[] D,int[] E){
    int [][] prefix2D =PrefixRowMatrix(A);
    PrintMatrix(prefix2D);
    int Q = B.length;
    int [] Ans = new int[Q];
    for (int i=0;i<Q;i++){
    int b = B[i] - 1;
    int c = C[i] - 1;
    int d = D[i] - 1;
    int e = E[i] - 1;
    for (int j=b;j<=d ;j++){
    if (c==0){Ans[i] += prefix2D[j][e];
    } else{
    Ans[i] +=prefix2D[j][e] - prefix2D[j][c-1];}
    }// time complexity : O(N^2)+O(QN)= O(N^2 + QN)
    //Space Complexity : O(Q)+O(N^C2)//
   }
   return Ans;
}

static int [] SubMatrixSumOptimize(int [][] A , int[] B , int[] C , int[] D , int[] E ){
    int [][] PS = prefixColumnMatrix(PrefixRowMatrix(A));
    int Q = B.length;
    int[] Ans = new int[Q];
     for (int i=0;i<Q;i++){
        int r1 = B[i]-1;
        int c1 = C[i]-1;
        int r2 = D[i]-1;
        int c2 = E[i]-1;
        long long Sum += PS[r2][c2];
        if(c1>){
        Sum -= PS[r2][c1-1];}

        if (c1>0 && r1>0){
            Sum += PS[r1-1][c1-1];}

        if(r1>0){
        Sum -= PS[r1-1][c2];}
        Ans[i] = (int)(Sum%mod);
     }
     return Ans;
     //Time Complexity // O(Q)+O(2N**2) //
     //Space Complexity // O(N**2)//
}


 //Matrix Input //
   static int [][]InputMatrix2D(int n ,int m){
    System.out.println("Enter Matrix Values : ");
        Scanner sc = new Scanner(System.in);
         int [][] Matrix = new int[n][m];
         for (int i = 0;i < n; i++){
            for (int j = 0 ;j < m; j++){
                Matrix[i][j] = sc.nextInt(); 
            }
         }
         return Matrix;
    }

    // this will give Print Matrix/
    static void PrintMatrix(int [][] Matrix){
      
         for (int i=0;i<Matrix.length;i++){
              for (int j = 0 ;j < Matrix[0].length ; j++){
                System.out.print(Matrix[i][j]+" ");
              }
              System.out.println("");
         }
    }

    //Input Query //
    static int [] QueryInput(int n){
        int [] Q = new int [n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n ; i++ ){
            Q[i] = sc.nextInt();
        }
        return Q;
    } 

      //Print Array//
    static void printArray(int[] A){
           for (int i=0;i<A.length ;i++){
            System.out.print(A[i]+" ");
           }
    }
  //prefix row//
    static int [][] PrefixRowMatrix(int [][] Matrix){
        int [][] prefixRows = new int [Matrix.length][Matrix[0].length];
        for (int i=0;i<Matrix.length;i++){
            prefixRows[i][0] =Matrix[i][0];
            for (int j = 1;j < Matrix[0].length;j++){
                prefixRows[i][j] = prefixRows[i][j-1]+ Matrix[i][j];
            }
        }
        return prefixRows;
    }
    //prefix column 
    static int[][] prefixColumnMatrix(int[][] Matrix){
        int row = Matrix.length;
        int col = Matrix[0].length;
        for (int j = 0; j < col ; j++){
            
            for (int i = 1;i < row ;i++){
                  Matrix[i][j] = Matrix[i-1][j] + Matrix[i][j];
            }
        }
        return Matrix;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N and M : ");
    int N = sc.nextInt();
    int M = sc.nextInt();
    int [][] Matrix = InputMatrix2D(N, M);
   

    System.out.println("Queries:");
    int [] B = QueryInput(2);
    int [] C = QueryInput(2);
    int [] D = QueryInput(2);
    int [] E = QueryInput(2);
    int [] Answer = SubMatrixSumOptimize(Matrix , B , C , D , E);
    printArray(Answer);
    }
}
