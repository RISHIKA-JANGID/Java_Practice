package Day5;
import java.util.*;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            int binary = sc.nextInt();
            int decimal =0;
            int power =0;
        
        
        while(binary>0){
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            binary = binary/10;
            power++;
        }
    
    System.out.println(decimal);
    } 
} 
}
