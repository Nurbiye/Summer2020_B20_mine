package day22_NestedLoop;

public class Nested_Loop3 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){

            System.out.println("*");
        }
        System.out.println();
        System.out.println("======================");

        /*
         *******
         *******
         *******
         *******
         */


        int j = 1;
        while(j<= 4){

            for(int i = 1; i <= 10; i++){
                System.out.print("*");
            }
            System.out.println();

            j++;
        }





    }
}