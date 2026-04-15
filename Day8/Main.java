public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;
         int j =0;
         while(j<k){
        int a = arr[n-1];
        for(int i =n-1; i>0; i--){

            arr[i] = arr[i-1];
        }
    
        arr[0] = a;
        j++;
    }
        for(int b : arr){
    System.out.print(b);
        }
        
    } 
        
  }

