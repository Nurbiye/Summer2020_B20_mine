package day42_Static;

public class Circle {
    double radius;
    double diameter;
    static double pi = 3.14;  // 1.static has advantage in:    same one copy shared by every single object
  // even later we create other circle object, they still have the same Pi value
    public void setInfo(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea() {
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return diameter * pi;   //radius*2*pi;
    }

    public String toString() {
        return "Radius: " + radius + "\nDiameter" + diameter +"\nPi: "+pi +"\nArea: " + calcArea() + "\nPerimeter: " + calcPerimeter();
    }
    // we can use static and instance variable in this to string method:
        // instance method belongs to the object, object method, so there is no any problem accept static
    //class matter accepted, because methods created by classes
    //instance belong to the object, object is crs
//create the object:  to store the different data
    //why we need instance? --for each of the object, we need its unique copy
    //pls
}
