

import java.util.*;

public class presentornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int [] arr = {10, 20, 30, 40, 50};
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        boolean found = false;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == n){
                found = true;
                break;
            }
        }


        
        if(found){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }


    }
}
