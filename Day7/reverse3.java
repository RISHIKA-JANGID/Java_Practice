public class reverse3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
       
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int a : arr){
            System.out.print(a+ " ");
        }
    }   
      
        static void reverse(int arr[], int i, int j) {
         while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    } 
        
  }

