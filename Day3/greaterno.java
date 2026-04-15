
import java.util.*;
public class greaterno {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long a = 1586398;

        System.out.println("Enter the number:");
        long b = sc.nextLong(); 

        if(a>b){
            System.out.println("Greater number is:" + a);
        }else{
            System.out.println("Greater number is:" + b);
        }
    }
}
