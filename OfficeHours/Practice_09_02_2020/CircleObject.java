package OfficeHours.Practice_09_02_2020;

public class CircleObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3); //first object
        System.out.println("circle1 radius: "+ circle1.radius);
        System.out.println("circle1 diameter: "+ circle1.diameter);
        //System.out.println("circle1 area: "+circle1.calculateArea() );
        System.out.println("circle1 area:"+ circle1.area);

        //System.out.println("circle1 perimeter: "+circle1.calculatePerimeter() );
        System.out.println("circle1 perimeter"+ circle1.perimeter);

        System.out.println("====================================");

        Circle circle2 = new Circle(5);
        System.out.println("circle2 radius: "+ circle1.radius);
        System.out.println("circle2 diameter: "+ circle1.diameter);
        //System.out.println("circle2 area: "+circle1.calculateArea() );
        System.out.println("circle2 area:"+ circle1.area);

        //System.out.println("circle2 perimeter: "+circle1.calculatePerimeter() );
        System.out.println("circle2 perimeter"+ circle1.perimeter);

        System.out.println("=====================================");

        Circle circle3 = new Circle(10);
        System.out.println("circle3 radius: "+ circle1.radius);
        System.out.println("circle3 diameter: "+ circle1.diameter);
        //System.out.println("circle3 area: "+circle1.calculateArea() );
        System.out.println("circle3 area:"+ circle1.area);

        //System.out.println("circle3 perimeter: "+circle1.calculatePerimeter() );
        System.out.println("circle3 perimeter"+ circle1.perimeter);

        System.out.println("=====================================");
        //find the area of the circle that has radius of 10

        System.out.println("Area: "+new Circle(10).area);
        System.out.println("Perimeter: "+new Circle(20).perimeter);

        System.out.println("======================================");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);




    }
}
