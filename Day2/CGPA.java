
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double c = (n1+n2+n3)/3;
        double cgpa = c/9.5;
        System.out.println(cgpa);

    }
}
