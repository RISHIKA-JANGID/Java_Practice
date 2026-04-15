import java.util.Arrays;
public class triplesum {
    public static void main(String[] args) {
         int arr[] = {1, 2, 4, 5, 8, 5,2,4};
        int target = 11;
        Arrays.sort(arr);

         for(int k =0; k<arr.length-2; k++){
            if(k > 0 && arr[k] == arr[k-1]) continue;
            int i =k+1;
         int j = arr.length-1;

         while(i<j){
            int sum =arr[i]+arr[j]+arr[k];
            if(sum == target){
                System.out.println(arr[i]+ " "+arr[j]+" "+ arr[k]);
                
                i++;
                j--;
            }else if(sum<target){
                i++;
            }else {
                j--;
            }
            }
        }
         
    }
}
