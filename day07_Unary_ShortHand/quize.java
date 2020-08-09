package day07_Unary_ShortHand;

public class quize {
    public static void main(String[] args) {

      int ivar=100;
      double dvar =123;
      float fvar =200;
      ivar=(int)fvar; //it can't be : ivar=fvar, it will show error. i can assign larger to smaller primitive by casting.
      fvar=ivar;
      dvar=fvar;
      fvar=(float)dvar; //explicit casting
      dvar=ivar;
      ivar=(int)dvar; // explicit casting


        System.out.println("a" + 0 + 1);
        System.out.println("b" + (1+2));

        long a =30L;
        long b= (short)a;
        System.out.println(b);

        float m =100.9347839f;
        short k = (byte)m;
        byte c = (byte)k;
        System.out.println(c);

        int z =3,y=2;
        long v=(z+y)*2/3%2;//10/3%2=3%2=1
        System.out.println(v);





    }
}
