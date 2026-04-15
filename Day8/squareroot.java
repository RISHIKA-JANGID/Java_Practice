public class squareroot {
    public static void main(String[] args) {
        int num = 25;
        
        int n = num/2;
        int low =1;
        int high = n;
        int ans =0;

        while(high>=low){
            
            int mid = high+low/2;
            if(mid*mid>num){
                high = mid-1;
            }else if(mid*mid<num){
                low = mid+1;
            }else{
                    ans = mid;
            }
        }
            System.out.println(ans );
    }
}