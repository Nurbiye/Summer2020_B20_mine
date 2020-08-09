package day06_ComparisionOperators; // 06/10 wednesday

public class implicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 =(long)s1; //if we implicit manually

        int I1 = 300;
        double D1 = I1; //300.0

        System.out.println(D1);
        double D2 = (double) I1; //that grey colored variable is

        System.out.println("=========================");
        double d1 = 400.5555;
        int i1 = (int)d1; //400
        System.out.println(i1);

        long L1 = 4400;
        short sh1 =(short) L1; //we can't assign short to int, short assign to short or byte, but 4400 here is out of byte's range
        System.out.println(sh1);

        int n1 = 1000;
        byte b1 = (byte)n1;//but n1=1000 is larger than byte's range...
        System.out.println(b1); //system printout nagetive number=-24

        double m1 = 34.5;
        float f1 = (float) m1;
        System.out.println(f1);

        long r1 = -500;
        int p1 = (short)r1; // we also can cast int of course
        System.out.println(p1);




    }


}
