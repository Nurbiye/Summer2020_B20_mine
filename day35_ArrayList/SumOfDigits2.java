package day35_ArrayList;

public class SumOfDigits2 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;

        for ( char each : str.toCharArray() ){  //we convert the string to char
            if (Character.isDigit(each) ){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);







    }
}
