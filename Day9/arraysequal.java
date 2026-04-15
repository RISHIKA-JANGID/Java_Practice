public class arraysequal {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,6,4,7};

        if(arr1.length != arr2.length){
            System.out.println("false");
            return;
        }

        boolean ans = true;
        int i=0;
        while(i<arr1.length){
                if(arr1[i] != arr2[i]){
                    ans = false;
                    break;
                } 
                i++; 
            }
                            System.out.print(ans);

        }
    }

