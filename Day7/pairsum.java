public class pairsum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 8};
        int k = 9;
        int n = arr.length-1;

        for(int i =0; i<=n; i++){
            for(int j =i+1; j<=n; j++){
                if(arr[i]+arr[j] == k){
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }

    }
}
