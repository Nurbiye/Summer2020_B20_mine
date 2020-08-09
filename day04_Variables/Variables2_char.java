package day04_Variables;

public class Variables2_char {
    public static void main(String[] args) {
        char ch1= 'A'; // we can assign single character within the single quote
        char ch2 = 65; // or we can assign numbers without quote
        //but it prints character at the end, not numbers
        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = 40000;
        System.out.println(ch3);
        // 0 < char < 65535 we can assign number between this to char
        // it has to be whole numbers

        char ch5 = 56879;
        System.out.println(ch5);


        char c1 = 'A'; //65
        char c2 = 'B'; //66
        // c1+c2= 65+66=131   if we do addition between character, it adds numbers and print numbers
        System.out.println(c1+c2);

        int result = c1+c2; //131
        System.out.println(result);

        double d = c1 + c2;
        System.out.println(d);

        int num1 ='A'; //we can assign character to int.
        System.out.println(num1); // 65, we can assign characters in terms of their number,and check the range

        char c4 =65+45; //even we can add number in char, but we don;t use it like this in future
        System.out.println(c4);//when we declaring specific character

        char c5 = 'Z';
        char c6= 897; //represent character
        System.out.println(c6);

        char c7 = '1'; // 1 here is character,it is represented number is 49,
        System.out.println( c7 + 1); // 49+1=50



    }




}
