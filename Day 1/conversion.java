import java.util.*;

public class conversion {

    public static int sourceToDecimal(int sn, int sb) {
        int power = 1;
        int decimal = 0;

        while (sn != 0) {
            int digit = sn % 10;
            decimal += digit * power;
            power *= sb;
            sn /= 10;
        }
        return decimal;
    }

    
    public static int decimalToDest(int dec, int db) {
        int power = 1;
        int result = 0;

        while (dec != 0) {
            int digit = dec % db;
            result += digit * power;
            power *= 10;
            dec /= db;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();

        int decimal = sourceToDecimal(sn, sb);
        int answer = decimalToDest(decimal, db);

        System.out.println(answer);
    }
}
