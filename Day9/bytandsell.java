public class bytandsell {
    public static void main(String[] args) {
        int arr[] = {7,5,2,1,8,6,9};
        int n = arr.length;

        int maxprofit =0;
        int minstock = arr[0];
        for(int i =0; i<n; i++ ){
            minstock = Math.min(minstock, arr[i]);
            int profit = arr[i] - minstock;
            maxprofit = Math.max(maxprofit, profit);
        }
        System.out.println(maxprofit);
    }
}
