package day51_Exceptions.webDriver;
/*
5. create a class called Test:
            create an object of each browsers and call the get & close actions
 */
public class Test {
    public static void main(String[] args) {
        ChromeBrowser cmb = new ChromeBrowser();
        cmb.get("https://www.google.com/");
        cmb.close();
        System.out.println("=====================");

        FireFoxBrowser ffb = new FireFoxBrowser();
        ffb.get("https://www.google.com/");
        ffb.close();
        System.out.println("=====================");

        OperaBrowser ob = new OperaBrowser();
        ob.get("https://www.google.com/");
        ob.close();
        System.out.println("=====================");






    }


}
