
public class arraysum {
    public static void main(String[] args) {
        float sum =0;
        float[] arr = {100.0f, 102.0f, 103.0f, 104.0f, 105.0f};
        for(int i =0; i<=arr.length-1; i++){
        sum = sum+arr[i];
    }
        System.out.println(sum); 
        
    }
}
