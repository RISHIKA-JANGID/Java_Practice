import java.util.*;

public class armstrongnumber {

    // function to check Armstrong number
    public static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;

        // count digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        // calculate power manually
        while (temp != 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum += power;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArmstrong(n));
    }
}
