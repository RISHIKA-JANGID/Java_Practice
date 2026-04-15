import java.util.*;
class HollowDiamond1 {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int N=n*2-1;        int mid = N / 2;

        for (int row = 0; row < N; row++) {

            int stars, spaces;

            if (row <= mid) {
                stars = mid - row + 1;
            } else {
                stars = row - mid + 1;
            }

            spaces = N - 2 * stars;

            // special case: first and last row
            if (spaces < 0) {
                for (int i = 0; i < N; i++) {
                    System.out.print("*");
                }
            } else {
                // left stars
                for (int i = 0; i < stars; i++) {
                    System.out.print("*");
                }

                // middle spaces
                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }

                // right stars
                for (int i = 0; i < stars; i++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}