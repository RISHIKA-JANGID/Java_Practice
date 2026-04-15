package Day7;
public class palindrome {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1};
        int i =0;
        int j= arr.length-1;

        while(i<j){
            if(arr[i] != arr[j]){
                System.out.print("No");
                return;
            }
            i++;
            j--;
        }
        
                System.out.println("Yes");
            
    }
}
