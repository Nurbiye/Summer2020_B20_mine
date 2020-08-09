package day07_Unary_ShortHand;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Post_VS_Pre {
          public static void main(String[] args) {
              int b =10;
              System.out.println(b++);//10
              System.out.println(b); // 11

              System.out.println("=================");

              int c =25;
              int d = c++; //d=25
              //c=26
              System.out.println(c);
              System.out.println(d);

              System.out.println("==================");
              int e=25;
              e++; //this step it returns 25,
              System.out.println(e); //eventually it returns 26.

              System.out.println("===================");
              int x =2;
              int y =x++;
              System.out.println(y);//2, but if this print statement it asks x value will be 3.

              System.out.println("===============");

              int A= 1; //A1=0 A2=1 A3=0
              A = -A-- + A++ / -A-- * --A;
              //A= -1 + 0 / -1 * -1
              //A= -1 + 0 * -1=-1
              System.out.println(A); //-1


              System.out.println("================");
              int B = 50; //B1=49 B2=50 B3=49 B4=50 ,at the end 197
              B = --B + B++ + B-- + B++ ;
              // B= 49 + 49 + 50 + 49;
              // =98+50 +49=148+49= 197;
              System.out.println(B);

              System.out.println("================");

              int C = 4;
              int D = C * 4 - C++;//C++=4 first, C=5 when print
              //D=4*4-4=16-4=12
              System.out.println(D); //12




          }



}
