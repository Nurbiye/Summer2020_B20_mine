package day29_CustomMethods;
   /*
     create a method that can calculate two numbers: num1, operator, num2
   */
public class Calculator {

    public static void main(String[] args) {
        calculator(100,'/',50);
        calculator(3984,'*',432487236);

    }




    public static void calculator(double num1,char operator,double num2){
        //operator we have + - * / %  or invalid
        switch(operator){ //we also can apply ternary or multi-If statement
            case'+':
                System.out.println("Addition: " + (num1 +num2) );
                break;

            case'-':
                System.out.println("Subtraction: "+(num1-num2) );
                break;

            case'*':
                System.out.println("Multiplication: "+(num1*num2) );
                break;

            case'/':
                System.out.println("Division: " + (num1/num2));
                break;

            case'%':
                System.out.println("Remainder: " + (num1%num2));
                break;

            default:
                System.out.println("Invalid operator");

        }
    }






}
