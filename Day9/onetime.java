public class onetime{
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 9, 5, 1, 2};

        int result =0;
        for(int num : arr){
            result = result^num;
        }
        System.out.print(result);
    }
}