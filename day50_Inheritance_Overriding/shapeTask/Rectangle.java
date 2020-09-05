package day50_Inheritance_Overriding.shapeTask;

import sun.plugin.dom.css.Rect;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length =length;
        this.width = width;
        area =calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return length*width;
    }

    public double calculatePerimeter(){
        return 2*(length+width);
    }





}
