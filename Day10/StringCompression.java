

import java.util.*;

public class StringCompression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        int count = 1;
        for(int i =0; i<n-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                System.out.print(s.charAt(i)+""+count);
                count = 0;
            }
            count++;
        }
        System.out.println(s.charAt(s.length()-1) +"" +count);
    }
}
