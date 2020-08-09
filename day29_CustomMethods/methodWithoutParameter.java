package day29_CustomMethods;
/*
step1: print hello world 5 times
step2: print your school name
step3: print hello world 5 times
step4: print your name
step5: print hello world 5 times
 */
public class methodWithoutParameter {
    //create the method under class
    public static void main(String[] args) {

        for(int i = 10; i >= 6; i-- ){
            System.out.println("Hello World");
        }

        System.out.println("Cybertek");

        for(int i = 10; i >= 6; i-- ){
            System.out.println("Hello world");
        }

        System.out.println("Muhtar");

        for(int i = 10; i >= 6; i-- ){
            System.out.println("Hello World");
        }
        // we are using for loop for printing hello world for 3 times, what if this loop is 20 more lines
        //it is better we can store them somewhere else as method, since method is use for storing, grouping the data






    }




}
