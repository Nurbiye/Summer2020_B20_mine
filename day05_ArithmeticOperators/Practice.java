package day05_ArithmeticOperators;

public class Practice {
    public static void main(String[] args) {
        int a = 5+2*4;
        int b = 10/2 -3;
        int c = 8+12*2-4;
        int d =4 + 17%2 -1; //17%2 is asking remainder.
        // (remainder: numerator-(denominator*whole number of the result)
        int e =6 - 3*2 + 7 -1;

        // Mathematical precedence: Parenthesis, multiply, divide, remainder,addition, subtraction
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println( d );
        System.out.println( e);

        System.out.println( 5 +5/5); //6
        System.out.println((5+5) /5 ); //2 , parenthesis is first in order
        System.out.println( (5+5) / 5.0 ); //2.0

        int y = 5*2/3+(4*3);  //5*2/3+12=10/3+12=3+12=15
        System.out.println(y);
        double z = 5*2/3+(4*3); //even we change the int to double, but it still will shows integer, not the correct answer,
        // so we change the numerator or denominator to decimal number.
        double x =5*2/3.0+(4*3); //we could get accurate result.
        System.out.println(z);
        System.out.println(x);

    }


}
