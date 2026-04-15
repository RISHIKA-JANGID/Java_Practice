
public class checksen {
    public static void main(String[] args) {
            String s = "MyNameIsRishikaJangid";
            int n = s.length();
           
            System.out.print(s.charAt(0));
            for(int i =1; i<n; i++){
                char ch = s.charAt(i);
                
                if(Character.isUpperCase(ch)){
                    System.out.println();
                }
                System.out.print(ch);
            }

                
            
        }
}
