import java.util.*;
public class String_removeduplicate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int n = s.length();
            
            System.out.print(s.charAt(0));
            for(int i=1; i<n; i++){
               
                if(s.charAt(i) != s.charAt(i-1)){
                    System.out.print(s.charAt(i));
                }
            }

        }
}
