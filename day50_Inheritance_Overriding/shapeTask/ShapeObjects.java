package day50_Inheritance_Overriding.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea() );
        System.out.println(circle.calculatePerimeter() );

        Rectangle rectangle = new Rectangle(7,3);
        System.out.println(rectangle.area);


    }
}
