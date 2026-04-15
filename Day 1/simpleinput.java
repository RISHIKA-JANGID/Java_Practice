import java.util.*;

public class simpleinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();

           
            if (sum + num < 0) {
                break;
            }

            sum += num;
            System.out.println(num);
        }

        sc.close();
    }
}
