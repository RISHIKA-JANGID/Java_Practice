import java.util.*;
public class integerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        if(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("The number is an integer:" + num);
        }else{
            System.out.println("The number is not an integer.");
        }
    }
    
}
