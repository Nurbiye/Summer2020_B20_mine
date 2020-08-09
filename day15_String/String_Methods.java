package day15_String;

public class String_Methods {
    public static void main(String[] args) {
           String name= "Cybertek School is a great place";
        //index number   01234567

        //charAt(index)

       // name.charAt(0); //it will returns to char, so we can assign it to char variable. char==>single character
        char ch1= name.charAt(0);//'C'
        char ch2= name.charAt(5);//this one prints 't'
        System.out.println(ch1);
        System.out.println(ch2);


        //length() ===> int ,it returns integer, one unit above the index number.
        int l = name.length();
        System.out.println(l);

        //last index == length of String - 1;
        int lastIndexNumber = name.length() -1;
        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //concat(Str):
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" school"); //"Cybertek School"
        System.out.println(schoolName);

        String r1= "Cybertek" +123+ 'A'+true;
        System.out.println(r1);

        String r2 = "Cybertek".concat("123"); //inside of the concat(here only a string )
        System.out.println(r2);


        //toLowerCase:
        String name1 = "CYBERTEK SCHOOL";
        name1= name1.toLowerCase();
        System.out.println(name1);

        //toUpperCase:
        String name2= "nurbiye";
        name2 = name2.toUpperCase();
        //when we create this object, it doesn't modify the former object, instead it creates the new one.
        System.out.println(name2);

        // trim():  remove unused spaces...but not the spaces between words
        String p = "     Cybertek       School    ";
        p =  p.trim();  // "Cybertek      School"

        System.out.println(p);







    }
}
