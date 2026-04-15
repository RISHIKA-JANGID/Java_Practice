import java.util.Scanner;
public class printseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i =1; i<=n1 ;i++){
            if((3*i+2)%n2!=0){
                System.out.println(3*i+2);
            }else{
                n1++;}
            }
        sc.close();
        }
    }

