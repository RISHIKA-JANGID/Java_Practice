public class pairsum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 8};
        int target = 9;

        int left =0;
        int right = 1;
        
        while(left<right){
            if(arr[left]+ arr[right] == target){
            System.out.print(arr[left]+ " "+ arr[right]);
            break;
        }

            left++;
            right++;
        }
    }
}
