package day04_Variables;
  /*
  primitives: byte, short, int, long, float, double, char, boolean
         DataType variableName = Data
         double > float >long >int > short > byte

   */
public class Variables_Practice2 {
      public static void main(String[] args) {
          int iNum =50;
          long lNum = iNum; //50

          // int iNum2 = lNum;
          float fNum = lNum;  // 50.0

          // WE CAN'T REUSE THE VARIABLE NAMES THAT USED ABOVE

          //1,000,000
         int num1 = 1_000_000; //it doesn't print lower case, lower case is for easy to reading
          System.out.println(num1);

          int num2;    // = is assignment operator, used for initializing values to variables
          num2 = 5000; //5000
          num2 = 2000; //2000 latest printed one

      }


}
