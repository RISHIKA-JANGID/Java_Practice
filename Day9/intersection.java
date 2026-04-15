import java.util.Set;
import  java.util.TreeSet;
public class intersection {
        public static void main(String[] args) {
           int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 3, 5, 7};
        
        Set<Integer> set = new TreeSet<>();
        Set<Integer> result = new TreeSet<>();

        for(int i =0; i<arr1.length-1; i++){
            set.add(arr1[i]);
        }

        for(int j =0; j<arr2.length-1; j++){
            if(set.contains(arr2[j])){
                result.add(arr2[j]);
            }
        }
        System.out.print(result + " ");
        }
}
