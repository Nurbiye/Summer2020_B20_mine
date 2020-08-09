package day17_StringReview;

public class Poll_VS_Heap {
    public static void main(String[] args) {
        String s1 = "Cybertek";//string pool
        String s2 = "Cybertek";//pool

        String s3 = new String("Cybertek");//heap
        String s4 = new String("Cybertek");//heap

        String s5 = "cybertek";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4==s5);








    }
}
