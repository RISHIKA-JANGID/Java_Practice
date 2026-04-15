public class reverse2 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4};
        int n = arr.length;

        int rev[] = new int[n];
        for (int i =0; i<n; i++) {
            rev[i] = arr[n-i-1];
        }
        for(int a : rev){
            System.out.print(a + " ");
        }
    }
}
