import java.util.*;
public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the name:");
         String name = sc.nextLine();
         
         name = name.toLowerCase();
         System.out.println(name);
    }
}
