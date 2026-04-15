public class missingno {
    public static void main(String[] args) {
        int arr[] = {5,6,7,9,10};
        int ans = 0;
        int count = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] != count){
                ans = count;
                break;
            }else{
                count++;
            }
        }
        System.out.println(ans);
    }
}
