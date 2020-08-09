package day18_ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        //if we want to print hello world 100 times, what can we do? are we going to print 100times?
        //so we lear loop to do that...today we learn for loop:

        System.out.println("========================");
        for(int i = 0; i <10;i++){  //if we don't give i++(iterator),loop doesn't stop, will occur logical error
      // initialization condition that return boolean based on initialization
            System.out.println("hello world");
        }


        System.out.println("====================");
        for(int i=0; i<50;i++){
            System.out.println("Nurbiye Kuresh");
        }



        //1. Write a program that displays each even/odd number in popup between 1 and 32
        for(int i=0; i<=32; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
            }
        System.out.println();
        for(int i=1; i<=32;i++) {

            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }

        // 2. Write a program that the user to declare a positive integer.
        // It should then print the multiplication table of that number.
        //Write a program that asks user to enter his/her username and password until user enters correctly.









    }
}
