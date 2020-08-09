package day17_StringReview;

public class String_methods2 {
    public static void main(String[] args) {
        //equals():
       String s1 = "Cat";
       String s2 = new String("Cat");
        String s3 = new String("Cat");
        System.out.println(s1==s2);//false (false due to different memory location)
        System.out.println(s1.equals(s2));//true(just compare the string text

        System.out.println(s2==s3);//false
        System.out.println(s2.equals(s3));//true

        //equalIgnoreCase:
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equals(s5));//false, java can't ignore the case sensitivity
        System.out.println(s4.equalsIgnoreCase(s5));//true

        //isEmpty: check if the string is empty
        String str = " ";
        System.out.println((str.isEmpty()));//false
        str=str.trim(); //""
        System.out.println((str.isEmpty()));//true

        //contains
        String str3 = "Java, C3, Python, Ruby, C++";
        System.out.println(str3.contains("Java"));//true
        System.out.println(str3.contains("java"));//false
        System.out.println(str3.toLowerCase().contains("java"));//true

        //startsWith & endsWith :
        String str5 = "cybertek school";
        System.out.println(str5.startsWith("cyber"));
        System.out.println(str5.endsWith("ool"));









    }

}
