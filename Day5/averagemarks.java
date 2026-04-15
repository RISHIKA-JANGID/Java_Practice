public class averagemarks {
    public static void main(String[] args) {
        int[] marks ={35, 40, 45, 49, 43};
        int sum = 0;
        for(int i = 0; i<marks.length; i++){
            sum = sum+marks[i];

        }
        System.out.println("Average marks: " + sum/marks.length);
    }
}
