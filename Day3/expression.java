import java.util.*;

public class expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of final velocity:");
        float v = sc.nextFloat();

        System.out.println("Enter the value of initial velocity:");
        float u =sc.nextFloat();
    
        System.out.println("Enter the value of acceleration:"); 
        float a = sc.nextFloat(); 
        
        System.out.println("Enter the value of time:"); 
        float t = sc.nextFloat();
        
        float result = (v*v - u*u) / (2*a*t);
         System.out.println("The result is:" + result);
}
}
