import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        for (int n = N1; n <= N2; n++) {
            int temp = n;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;  // cube
                temp /= 10;
            }

            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}
