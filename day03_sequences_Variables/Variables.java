package day03_sequences_Variables;
/*
declare variables:
            DataType variableName = Data;
 */

public class Variables {
    public static void main(String[] args) {

        //length: 10, width: 4, area: 8

        byte length = 2;
        byte width = 4;
        System.out.println(2*4);
        System.out.println(length*width);

        //byte, short, int, long------each has range, and use for integer numbers,whole numbers
        //int is preferred primitive foe whole numbers

        int score = 100;
        System.out.println(score);

        // PI = 3.14
        double PI= 3.14;
        System.out.println(PI);


        // for decimal numbers: float (add f to the end of the number) , double(compiler prefers this)
        //float, double, char, boolean
        float decimal1 = 3.5f;  //if not adding f at the end, it shows error,since compiler recognize decimals as double.
        //compiler recognize the decimal number as double by default, so we add f at the end of the decimal number.

         double BI= 22/7;
        System.out.println(BI);



    }




}

      /*
      public class Max_value {
        public static void main(String[] args)
        {
            // byte variable
            byte max_value;
            // MAX_VALUE Byte class
            max_value = Byte.MAX_VALUE;
            // printing the MAX_VALUE
            System.out.println(max_value);
        }





       */