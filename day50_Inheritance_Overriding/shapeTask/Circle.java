package day50_Inheritance_Overriding.shapeTask;

public class Circle extends Shape {
    public double radius;
    public double diameter;
    public static double PI = 3.14;


    public Circle(double radius){
        this.radius = radius;
        diameter=2*radius;
        area = calculateArea();  //this area  comes from Shape super class
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }




}
