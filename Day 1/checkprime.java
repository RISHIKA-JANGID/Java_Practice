import java.util.*;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int count = 0;

        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(n<=1){
            count++;
        }

        if (count != 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
            sc.close();
    
}
}
