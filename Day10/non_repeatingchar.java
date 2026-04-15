import java.util.*;
public class non_repeatingchar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          sc.nextLine(); 
        for(int i =0; i<n; i++){
            String s = sc.nextLine();
            

            int []freq = new int[26];
                //count
           for(int k =0; k<s.length(); k++){
                freq[s.charAt(k) - 'a']++;
           }
           int found = -1;
           //repeating
           for(int j =0; j<s.length(); j++){
                if(freq[s.charAt(j)-'a'] == 1){
                    System.out.println(s.charAt(j) );
                    found = 1;
                    break;
                }

           }
           if(found == -1){
                    System.out.println("-1");
                    
                }

        }   
    }
}