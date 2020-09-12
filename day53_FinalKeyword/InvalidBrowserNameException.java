package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException{
      //  after inheritending this became exception

    public InvalidBrowserNameException(){
        super("Invalid Browser Name");

    }

    public InvalidBrowserNameException(String str){
        super("Invalid Browser Name");

    }

}


class Test2{

    public static void main(String[] args) {
       String name = "cybertek";

       switch(name){
           case"chrome":
               System.out.println("chrome is selected");
               break;

           case"firefox":
               System.out.println("Firefox is selected");
               break;

           case "safari":
               System.out.println("safari is selected");
               break;

           default:
               throw new InvalidBrowserNameException("Please enter a valid brosenbu");



       }









    }

}