package Day7;

import java.util.Arrays;
public class SingleNumber2{
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 4, 5, 6 ,4, 5, 6, -3};
        int n = nums.length;
        int result =0;
        Arrays.sort(nums);
        int i =0;
        while(i<n-2){
               if(nums[i] == nums[i+2]){
                i+=3;
                
               } else{
                  result = nums[i];
                  break;
               } 
        }
        if(result == 0){
            result = nums[n-1];
        }
        System.out.print(result);

    }
}
