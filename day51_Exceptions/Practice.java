package day51_Exceptions;

class X {
    public X(){
        System.out.println("X");
    }
}

class Y extends X {
    public Y(){
        //super(); X --> X   //this will be done automatically, since they are default constructor
        System.out.println("Y"); // X Y
    }
}



class Z extends Y {
    public Z(){
        //super(); Y--> X Y
        System.out.println("Z"); // X Y Z
    }
}


public class Practice {
    public static void main(String[] args) {

        new Z();

    }


}
