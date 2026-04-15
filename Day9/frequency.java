import java.util.Arrays;
public class frequency {
    public static void main(String[] args) {
        int arr[] = {4,5,2,9,4,5,2,1,1,5};

        Arrays.sort(arr);
        int count = 1;
        for(int i =1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                        System.out.println(arr[i-1] + " " +count);
                        count =1;
            }
        }
        System.out.print(arr[arr.length-1]+ " " + count);
    }
}
