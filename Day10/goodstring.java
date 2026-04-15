import java.util.*;
public class goodstring {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
        String str = "aeiou";


        for(int i=0; i<s.length(); i++){
            for(int j =i; j<s.length(); j++){
                String c = s.substring(i, j+1);
                if(isGoodString(c)){

                }
            }
        }

    }
     public static int isGoodString(String s){
            String str = "aeiou";
            String result = "";
            int maxlen =0;
            for(int i=0; i<str.length(); i++){
                for(int j =i; j<str.length(); j++){
                    String g = str.substring(i, j+1);
                    if( s.equals(g)){
                        if(maxlen < g.length()){
                            maxlen = g.length();
                            result = result + g;
                        }
                       


                    }
                }
            }

    }
   
}
