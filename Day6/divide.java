public class divide {
    public static void main(String[] args) {
        int a = 90;
        int b = -9;

        
        int count = 0;
        int positive = 0;
        if(a<0 && b<0){
            a = -a;
            b = -b;
            positive = 2;
        }
        else if(a <0 ){
           a = -a;
           positive = 1;
        }else if(b<0){
          b = -b;
          positive = 1;
        }

        while(a>=b){
            a -= b;
            count++;
            
        }

        if(positive == 0 || positive == 2){
            System.out.println(count);
        }else{
        System.out.print(-count );
        }
    }
}
