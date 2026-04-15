
import java.util.Scanner;

public class vowels {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            String s = sc.nextLine();

            int maxlen =0;
            int count =0;
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(c == 'a' || c== 'e' || c=='i' || c=='o' ||c== 'u'){
                    count++;
                    if(count>maxlen){
                        maxlen = count;
                    }
                }else{
                    count =0;
                }
            }
            System.out.print(maxlen);
        }
}
