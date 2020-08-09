package day03_sequences_Variables;

public class EscapeSequences {   //today we learn common escape sequences
    public static void main(String[] args) {

        System.out.println("Hello Everyone \nMy name is Nurbiye");  //\n:the message after this will print in new line
        System.out.println("\tI am in Texas\n");  // \t:the message after this will have two space (paragraph space)
        System.out.println("\n\n\t\t\tI Love programming"); //look at the order

        System.out.println("\\"); //this prints me one back slash
        System.out.println("/");  //this prints me one front slash
        System.out.println("\\\\"); //this prints me two back slash
        System.out.println("\\\\\\"); //this prints me three back slash
        System.out.println("//"); // this prints me two front slash

        System.out.println("My Name is \'Nurbiye\'"); //it prints'Nurbiye', i can use single quote directly on  Nurbiye.
        System.out.println("My Name is \"Nurbiye\""); //but for printing the Nurbiye in the double quote in should only use escape sequences :  /"  /"


    }



}
