package day07_Unary_ShortHand;
/*
write a program that can verify if a number is positive, negative, 0
        Positive_Negative_0
        Ex:
            number = 120
        Output:
            120 is a positive number? true
            120 is negative number? false
            120 ii zero? false
 */

public class Positive_Negative_0 {
    public static void main(String[] args) {
      int num= 120;
      boolean result1 = num >0;
      boolean result2 = num <0;
      boolean result3 = num ==0;

        System.out.println(num +" is positive? " + result1);
        System.out.println(num +" is negative? " + result2);
        System.out.println(num +" is Zero? " + result3);




    }
}
