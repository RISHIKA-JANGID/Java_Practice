import java.util.*;

public class hollowdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 2*N-1;
        

        for(int i = 1; i<=a; i++){
            int space;
            if(i<=N)
                space = i-1;
             else
                space= a-i;

            for(int j =1; j<=a; j++){
               if (j <= space || j > a - space ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            sc.close();
        }
    }
    
}

