import java.util.*;
public class calculatethesum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();

        while(q>0){
            int x = sc.nextInt();
            q--;
        }
        //right rotation
        int last = arr[arr.length-1];
        for(int i =arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        
        //adding
        int newArr[] = new int[n];
        for(int i =0; i<n; i++){
            newArr[i] = arr[i] + arr[(i+1)%n];

        }
        // value double
        int selfArr[] = new int[n];
        for(int i =0; i<n; i++){
                             selfArr[i] = newArr[i] + newArr[i];

        }
        int MOD = 1000000007;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += selfArr[i] ;

        }

        System.out.println(sum%MOD);

    }
}