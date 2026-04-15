import java.util.*;
public class transposeofmatrix {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr= new int[n][n];

        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
             arr[i][j] = sc.nextInt();
           }
        }
        int[][] tran = new int[n][n];
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
            tran[j][i] = arr[i][j];
             
           }

           
        }
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
            System.out.print(tran[i][j]+ " ");             
           }
           System.out.println();
        }   
    }
}