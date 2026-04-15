import java.util.*;
public class camelcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        String s = "MyNameIsRishika";

        String result = "";
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                result += " " + c;
            }else{
                result += c;
            }
        }
            System.out.println(result);
        
    }
}