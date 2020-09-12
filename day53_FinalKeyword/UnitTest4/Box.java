package day53_FinalKeyword.UnitTest4;

public class Box {
    double w;
    double l;
    public String print(){
        return "width: "+ w + " length: "+l;
    }
    public void setInfo(double w, double l){
        this.w = w;
        this.l = l ;
    }
}

class UseBoxes{
    public static void main(String[] args) {
        Box box = new Box();
        box.setInfo(5,11);
        System.out.println(box);
    }
}
