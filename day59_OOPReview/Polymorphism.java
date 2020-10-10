package day59_OOPReview;


import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;
import day55_Abstraction.ShapeTask.Shape;

public class Polymorphism {
    public static void main(String[] args) {

        Shape shape1 = new Circle(3);
       //  System.out.println(shape1.r);  //not all the shape has radius, radius is not in reference class
        System.out.println(     ( (Circle)shape1 ) .radius     );
                          //by down casting , we change the reference type to Circle, then we can call the radius from it
       // shape1.length;
        System.out.println( ( (Rectangle)shape1 ).length );
                      // make sure the class is calling should have is A relation
        //otherwise it will throws classCastException .


        Rectangle r1 = new Rectangle(3,5);
        Shape shape2 = r1;
        //Shape shape2 = (Shape) r1;  //upcasting , it can be done implicitly





    }
}
