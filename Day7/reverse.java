public class reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int i =0;
        int j = arr.length-1;
        
      
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j-=2;
        }
        for(int a : arr){

            System.out.print(a + " ");
        }

    }

}
