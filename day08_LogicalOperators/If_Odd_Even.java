package day08_LogicalOperators;

public class If_Odd_Even {
    public static void main(String[] args) {
        int number =100;

        boolean even = number%2==0;
        boolean odd = !even;

        if (even){
            System.out.println(number +" is even number");
            //if only this one if statement, while number is not even number, it won't print anything ,
            // thus it is bug, we have to fix it by creating another if statement : if (odd)
        }

        if(odd){
            System.out.println(number + " is odd number");
        }



    }
}
