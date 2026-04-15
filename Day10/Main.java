

public class Main {
        public static void main(String[] args) {
            String s="leetcode";
            int ans=-1;
           int freq[]=new int[26];
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            freq[idx]++;
        }
        for(int j=0; j<s.length(); j++){
            if(freq[s.charAt(j)-'a']==1){
                ans= j;

            }
        }

       for(int a:freq){
        System.out.print(a+" ");
       }
        System.out.println(ans); 
        }
}
