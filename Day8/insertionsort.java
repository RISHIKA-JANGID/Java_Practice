
public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 10, 12, 1, 5, 8};
        int n = arr.length;

        int j =0;
        while(j<n-1){
        int i =0;
        while(i<n-1){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
    
            }
            i++;
        }
          j++;
        }    
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}


