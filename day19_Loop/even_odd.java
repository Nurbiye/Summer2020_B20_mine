package day19_Loop;
/*
 1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */
public class even_odd {
    public static void main(String[] args) {
        for(int i=1; i<100;i+=2){ //i is odd number
            if (i%5==0 && i%3==0){ //can be divisible by 3 and 5. use and logic.
                System.out.print(i+" ");
            }
        }

        System.out.println(); //separate the each task by line

        for (int i=0;i<=100;i++){
            if(i%2!=0){ //pre-condition, i must be odd number
                if(i%5==0 && i%3==0){  //sub, must divisible by 3&5 //i%15==0
                    System.out.print(i+" ");
                }
            } //else is no need if not print out needed, else is not mandatory
        } // two independent loop, and we used the i inside the loop, so it is fine.

        System.out.println();
        System.out.println("===========================");
        for(int i=0;i<=100; i+=2){ //i is even number
            if(i%3==0 && i%5==0){ //divisible by 3 and 5.
                System.out.print(i+" ");
            }
        }
        System.out.println(); //new task start from new line

        for(int i =0; i<=100; i++){
            if(i%2==0){ //pre:must be even number
                if(i%15==0){ //i%3==0 && i%5==0  must be divisible by 3 and 5;
                    System.out.print(i+" ");
                }
            } //else is not mandatory
        }

        System.out.println();

        //in this whole task, we find the numbers divisible by 3 and 5,
        // so we can assign an boolean variable before start the loop.

    }
}
