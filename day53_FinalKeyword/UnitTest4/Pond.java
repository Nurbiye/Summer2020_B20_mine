package day53_FinalKeyword.UnitTest4;
// Q21
public class Pond {
    static Water water;
    public Pond(String color){
        water = new Water(color);
    }

}

class Water {
    String color;
    public Water(String color){
        this.color = color;
    }
}