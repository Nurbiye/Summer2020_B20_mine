package day05_ArithmeticOperators;


public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println();

        System.out.println( 20 * 3);
        System.out.println(2+3-1*4);//1
        System.out.println(10/3); //int/int===>int
        System.out.println(10.0/3); //double/int==> double
        System.out.println( 10/3.0); // int/double ==> double

        int outcome = 12 + 6/3;
        System.out.println(outcome);

        System.out.println(5+2*4);
        // Mathematical precedence: Parenthesis, multiply, divide,remainder, addition, subtraction
        System.out.println(10/2 - 3);
        System.out.println(8+12*2-4);
        System.out.println( 4 + 17%2 -1 );
        System.out.println( 6 - 3*2 + 7 -1);

        System.out.println(30%8);//30/8=3 ==> remainder: 30-(8*3)=6 , so the answer is 6.
        // % is asking remainder

        System.out.println(99 % 4); // 99/4=24===>but it is not the right 24, 99-(4*24)=3, so the answer is 3
    }

}
