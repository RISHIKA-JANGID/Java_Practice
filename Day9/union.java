import java.util.HashSet;
import java.util.Set;

public class union {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 3, 5, 7};
        
        Set<Integer> set = new HashSet<>();

        for(int i =0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j =0; j<arr2.length; j++){
            set.add(arr2[j]);
        }
        System.out.print(set + " ");

    }
}
