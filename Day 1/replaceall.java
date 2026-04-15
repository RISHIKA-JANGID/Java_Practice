import java.util.*;

public class replaceall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();   // changed to long

        if (n == 0) {
            System.out.println(5);
            return;
        }

        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = -n;   // now safe
        }

        long sum = 0;
        long num = 1;

        while (n > 0) {
            long rem = n % 10;

            if (rem == 0) {
                rem = 5;
            }

            sum = sum + rem * num;
            num = num * 10;
            n = n / 10;
        }

        if (isNegative) {
            sum = -sum;
        }

        System.out.println(sum);
    }
}
