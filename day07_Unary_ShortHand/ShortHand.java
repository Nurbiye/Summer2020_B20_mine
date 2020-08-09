package day07_Unary_ShortHand;

public class ShortHand {
    public static void main(String[] args) {
        //ShortHand Operators : =assignment +=addition assignment  -=subtraction assignment
        // *= /= %=

        int a =100;
        //a=a*a
        a *=a;
        System.out.println(a);

        int b= 300;
        b -=100; //300-100=200
        System.out.println(b);

        System.out.println("==================================");
        //+= addition assignment (+ we can apply to numbers, string
                               //and +=   it is the only assignment operator that we can apply string

        int z = 300;
        z +=200;
        System.out.println(z); //500

        String schoolName = "Cybertek";
            schoolName=schoolName + "school";
            schoolName += " school"; //Cybertek school.  it did the concatenation between string.
        // we use this more often in the future;
        System.out.println(schoolName);


        String fullName = "Nurbiye";
        fullName += " Kuresh";
        System.out.println(fullName);


        // /=division assignment
        int budget = 100000;
            budget = budget /2; // 50000
            budget /=2; //25000
        System.out.println(budget);
        //if we divide the number while printing, like Sout"budget/2",although it divides the number, but it didn.t assign the variable.


        // %=remainder assignment
        int R = 10;
        R %=2;
        System.out.println(R); //0

        int num1 = 100;
            num1 %=3;
        System.out.println(num1); // 100/3=33----1 so the result is 1;


        double num2 = 400.5;
               num2 %=2;
        System.out.println(num2); //0.5




    }
}
