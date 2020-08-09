package OurStudyGroup;

public class Odd_Even {
    public static void main(String[] args) {
        int number1 =100;
        boolean even = number1%2==0;
        boolean odd = !even;
        if (even) {
            System.out.println(number1 + " is even number");
        }
        if(odd){
            System.out.println(number1 + " is odd number");
        }

        System.out.println("=========================");
        int number = 78;
        if(number%2 !=0){
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        System.out.println("=========================");
        // Write a program that displays each even/odd number in between 1 and 43
        for(int i=1; i<=43; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=1; i<=43;i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println("=========================");
        //use continue statement to print the even and odd numbers
        for(int i=1; i<=60; i++){
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1; i<=60; i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }









    }
}
