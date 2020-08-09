package day06_ComparisionOperators; //2020-06-10 (wednesday)

public class RelationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10 > 9; //i can try less than as well    9<4 ===false
        System.out.println(r1);

        // >= greater or equal : or logic, either one is true,result will be true
        // <= less than or equal
        boolean r3 = 87 >=85;
        System.out.println(r3);

        boolean r4 = 877 >=878; //as long as neither condition is false, it returns false
        System.out.println(r4);

        // == : equal
        // = and == are different, =assignment operator,initialize. ==is equal,comparision
        boolean r5 = true==false;
        System.out.println(r5);
        // boolean r6= "123" == 123; -----if it is different variable, don't compare them .
        //but if it is characters in Ascii-table and with their numbers are comparable
        boolean result1 = 'A'==65; // true
        boolean result2 = 'A'==65+2+1; //false
        boolean result3 = 100==100.0; //true, it is true in mathematically, like 100$ and 100.0$ is same
        boolean result4 = "100"=="100.0"; //false
        boolean result5 = 100 == 100.999999;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        // != : not equal
        boolean r7 = true!=false;
        System.out.println(r7);

        //even or odd number
        int number = 100;
        boolean even = number%2 == 0; //if this statement is true, then number is even
        boolean odd = number%2==0; //if this statement is true, then number is odd
        System.out.println(even);
        System.out.println(odd); //false


        // divisible by any number
        int x = 1000;
        //divisible by 3 : 1000%3 == 0;
        //divisible by 5 : 1000%5 == 0;
        // divisible by 10: 1000%10 ==0;





    }


}
