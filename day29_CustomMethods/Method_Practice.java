package day29_CustomMethods;

public class Method_Practice {
    /*
     1. create a method that can print odd numbers between 1~100 in a same line separated by space
    2. create a method that can print even numbers between 1~100
     */
    public static void main(String[] args) {
        oddNumbers();
        System.out.println("hello");
        oddNumbers();
        System.out.println("Nurbiye");
        evenNumbers();
        System.out.println();
    }

    //task1:
    public static void oddNumbers(){ //in order to run this method, we need to call it in main method
  //this custom method just as a storage, store our codes and we can use it in main method for executing
        for (int i = 1; i <=100 ; i +=2) { //odd numbers
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //task2:
    public static void evenNumbers(){
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }







}
