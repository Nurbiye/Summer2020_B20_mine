package day53_FinalKeyword;

public class BreakTimeException extends RuntimeException{

}

   class Test1{
       public static void main(String[] args) {

          // throw new RuntimeException();
           throw new BreakTimeException();
          // throw new Test1(); //since Test1 class is not an exception , so we couldn't use throw.
       }

}