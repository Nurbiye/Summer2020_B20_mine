package day12_switch_scanner;

public class Switch {
    public static void main(String[] args) {
        switch(1){ //let's get understand the switch statement first
            default:
                System.out.println("Invalid case");

            case 5:
                System.out.println("five");
                break; // break

            case 1:
                System.out.println("one");

                System.out.println("=================");
        }
           int num = 4;

       //we can assign String variable, then shorten the print statement. ==> String result="";

            switch(num){

                case 5 :
                    System.out.println("Friday"); //result="Friday", then print the result at the end of the switch statement.
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

                default://only execute if none of obove cases matching
                    System.out.println("Invalid");
                    break; //this time break can be no needed. since there is closing curly brace at the end

            }




    }
}
