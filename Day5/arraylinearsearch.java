import java.util.*;
public class arraylinearsearch {
    public static void main(String args[]) {
       Scanner sc = new Scanner (System.in);
       int n =sc.nextInt();
       
       int arr[] = new int[n];
       for(int i=0; i<n; i++){
           arr[i]= sc.nextInt();
       }
       int m = sc.nextInt();
        int result = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == m){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
