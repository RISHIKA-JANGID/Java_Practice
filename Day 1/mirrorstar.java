import java.util.*;
     public class mirrorstar{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            int row=1;
            int space=N/2+1;
            int star =1;
            while(row<=N){
                //space
                int i = 1;
                while(i<space){
                    System.out.print("00\t");
                    i++;
                }
                //star
                int j = 1;
                while(j<=star){
                    System.out.print("*\t");
                    j++;
                }
                System.out.println();
                if(row < N/2 + 1) {
                    star += 2;
                    space--;
                } else {
                    star -= 2;
                    space++;
                }
                row++;
            }
        }
     }