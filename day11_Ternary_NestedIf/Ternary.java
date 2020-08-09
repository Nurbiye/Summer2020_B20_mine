package day11_Ternary_NestedIf;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num%2==0){
            result="even";
        }else{
            result = "odd";
        }
        System.out.println(result);
        //use ternary to convert this even odd if statement
        String result2 = (num%2==0) ? "Even" : "odd"; //? is if, : is else.  shortcut.  ternary
        System.out.println(result2);


        System.out.println("=============================");
        //find the maximum number and assign it tot max1:
        int num1 = 1000;
        int num2 = 20;

        int max1=0;
        if (num1>num2){
            max1=num1;
        }else {
            max1=num2;
        }
        System.out.println(max1);

        int max2= (num1 > num2)? num1 : num2; //using ternary.
        System.out.println(max2);


        System.out.println("==========================");
        // if th e person eligible
        int age = 20;
        boolean eligible = false;
        if(age >= 21){
            eligible=true;
        }else{
            eligible = false;
        }
        System.out.println(eligible);

        boolean eligible2= (age>=21) ? true : false;
        System.out.println(eligible2);


        System.out.println("==================================");
        //"can vote" or "can not vote" ; age, citizenship
        int age1 = 25;
        //boolean citizenship= true;  //this is not a good way,let;s use string
        String citizen= "USA";
        String result3 = "";
        if(age >=18 && citizen == "USA"){
            result3 = "Can Vote";
        }else {
            result3 = "Can not Vote";
        }
        System.out.println(result3);
        //let's use ternary to convert about if statement:
        String result4 = (age >=18 && citizen == "USA") ? "Can vote" : "Can not Vote";
        System.out.println(result4);


        System.out.println("================================");
        // write a program that can check if two numbers are equal or not;
        int a= 30;
        int b= 48;

        String r = (a==b) ? "Equal" : "Not Equal";
        System.out.println(r);






    }
}
