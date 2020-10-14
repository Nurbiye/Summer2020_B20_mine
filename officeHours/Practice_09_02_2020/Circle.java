package officeHours.Practice_09_02_2020;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI; //global variable
    public  double area;
    public double perimeter;


    static{ //only runs one time, and first run(static block executed first
        PI =3.14;
    }


    public Circle(double radius){
        this.radius =radius;
        diameter = 2*radius;
        area= calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return radius*radius*PI;
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }


    public String toString() {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + ", area=" + area + ", perimeter=" + perimeter + '}';
    }
}
