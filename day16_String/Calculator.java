package day16_String;

import java.util.Scanner;

/*
write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    we can use Nested If or switch statement...
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter you first number:");
        double num1 = scan.nextDouble();

        System.out.println("enter you second number:");
        double num2 = scan.nextDouble();

        System.out.println("enter your operator");
        char operator = scan.next().charAt(0);
        //* / + - % are the math operators
        boolean valid = operator=='*' || operator=='/' || operator=='%' || operator=='+'||operator=='-';

        if(valid){
            switch(operator){
                case'*':
                    System.out.println(num1*num2); // we can also add the message ("multipi
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                    break;
                default:
                    System.out.println(num1 - num2);
            }

        }else{
            System.out.println("Invalid Operator");
        }




    }

}
