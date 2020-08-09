package day10_IfStatements;

public class MultiBranch {
    public static void main(String[] args) {
        // write a program that identify if the number is positive,negative or zero.
        int number = 100;
        //i can use 3 single if statement, but it is not the efficient way, compiler need to check each if statement one by one.
        //instead we can use multi-branch if statement.
        if(number>0){
            System.out.println(number + " is positive");
        }else if(number<0){
            System.out.println(number + " is negative");
        }else if(number==0){ // number == 0;
            System.out.println( number+ " is zero");
        }


    }
}
