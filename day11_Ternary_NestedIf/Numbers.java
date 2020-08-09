package day11_Ternary_NestedIf;
/*
warmup task:
    1. write a java program that can convert numbers between 0 ~ 9 to words,
    if the number is greater than 9 or less than zero, out put should be "Invalid".
    1--one              num<0 or num>9===> invalid
 */
public class Numbers {
    public static void main(String[] args) {
      int num = 7;

      String result="";

      if(num==0){
          result = "zero";
      }else if(num==1){
          result = "one";
      }else if (num==2){
          result ="two";
      }else if (num==3){
          result = "three";
      }else if (num ==4){
          result = "four";
      }else if (num==5){
          result = " five";
      }else if (num==6){
          result="six";
      }else if (num==7){
          result= "seven";
      }else if (num==8){
          result="eight";
      }else if (num==9){
          result="nine";
      }else if (num<0 || num>9){ //or i just use else block,
          //else{ result ="invalid"}
          result= "invalid";
      }
        System.out.println(result);
        System.out.println("=================");
        //we can also use ternary
        //String result1 = ()




int x=10;
int y = x++;
        System.out.println(y++ + " " + x++ + " " + y);



    }
}
