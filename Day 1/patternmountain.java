public class patternmountain {

    public static void main(String[] args) {

        int N = 5;

        for (int i = 1; i <= N; i++) {

            // left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }

            // middle stars
            for (int s = 1; s <= 2 * (N - i) - 1; s++) {
                System.out.print("*\t");
            }

            if (i < N) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + "\t");
                }
            }else{
                for (int j = i-1; j >= 1; j--) {
                    System.out.print(j + "\t");
                }
            }

            System.out.println();
        }
    }
}
