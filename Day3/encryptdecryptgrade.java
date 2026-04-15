
import java.util.Scanner;

public class encryptdecryptgrade {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number:");
    int grade = sc.nextInt();

    int encryptedgrade = grade+8;
    System.out.println("Encrypted grade is:" + encryptedgrade);

     int decryptedgrade = encryptedgrade-8; 
     System.out.println("Decrypted grade is:" + decryptedgrade);
}
}
