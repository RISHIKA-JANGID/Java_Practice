import java.util.*;
public class pairofroses{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i<t; i++ ){

        
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int j =0; j<n; j++){
            arr[j] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        int a =0;
        int b =0;
        int maxdiff = Integer.MAX_VALUE;

        int left =0;
        int right = n-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum==target){
                int diff = arr[right] - arr[left];
                if(diff<maxdiff){
                    a = arr[left];
                    b = arr[right];
                    maxdiff = diff;

                }

                while(left<right && arr[left] == arr[left+1])left++;
                while(left<right && arr[right] == arr[right-1])right--;

                left++;
                right--;

            }
            else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
    
                    System.out.println("Deepak should buy roses whose prices are " + a + " and " + b);
    }
  }
}