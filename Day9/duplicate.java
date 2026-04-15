import java.util.HashSet;
import java.util.Set;
public class duplicate {
    public static void main(String[] args) {
         int arr[] = {4,5,2,9,4,2,1,1};

         Set<Integer> set1 = new HashSet<>();
         
        for(int num: arr){
            if(set1.contains(num)){
                System.out.print(num + " ");
                
            }
             set1.add(num );  
             
            
        }         
    }
}
