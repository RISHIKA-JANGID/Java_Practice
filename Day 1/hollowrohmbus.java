import java.util.*;

public class hollowrohmbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int space = N - 1;
        int star = N;
        int row = 1;

        while (row <= N) {

            // spaces
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            // stars 
            int j = 1;
            while (j <= star) {
                if (row == 1 || row == N || j == 1 || j == star) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            System.out.println();
            row++;
            space--;
        }
    }
}
