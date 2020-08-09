package day21_Loops;



public class DoWhile {
    public static void main(String[] args) {


    boolean result = false;
    while (result){ //while loop is never executed if the condition is false
        System.out.println("Hello Wold");
    }
        System.out.println("=======================");

    do{ //just do first     do first think later
        System.out.println("Hello Wold");
    }while (result);  //even the condition is false, it will execute the statement at least once
}
}