import java.util.*;

public class replacespaces {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.replace(" " , "_");
        System.out.println(a);
    }
}
