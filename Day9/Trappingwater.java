public class Trappingwater {
        public static void main(String[] args) {
            int arr[] = {0,1,2,5,4,2,3,5,6,2};
            int n = arr.length;
            int water =0;
            int left[] =new int[n];
            int right[] = new int[n];

            
                left[0] = arr[0];
                for(int j =1; j<n; j++){
                    left[j] = Math.max(left[j-1], arr[j]);
                }
                right[n-1] = arr[n-1];
                for(int j = n-2; j>=0; j--){
                    right[j] = Math.max(right[j+1], arr[j]);
                }
                for(int i =0; i<n; i++){
                water += Math.min(left[i] , right[i]) - arr[i];
            }
            System.out.print(water);
        }
}
