package day62_Maps;

import sun.lwawt.PlatformEventNotifier;

public class Test {
    public static void main(String[] args) {

       // String favoriteColor = "Pink";
        Color favoriteColor = Color.Blue;
        System.out.println(favoriteColor);


        //String browserName =  // instead of String, i can use the specific/limited data that in my enum, it goes faster.

        //Browser browserName1 = Browser.Opera;  -->Opera is not in enums value

        Browser browserName = Browser.chrome;
        //using Enum, performance will be faster, less chance to get unexpected result
        switch (browserName){
            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("fireFox browser is set");
                break;


            case safari:
                System.out.println("safari browser is set");
                break;

            case edge:
                System.out.println("edge browser is set");
                break;
               //in enum we only set 4 browser, so there no need to set default one


        }

        System.out.println("==================================");

        Day day = Day.Monday;
        Day day2 = Day.Tuesday;

        Month month1 = Month.Apr;

        Level level1 = Level.medium;
        Level level2 = Level.ChuckNorris;
        
       Planets planet = Planets.Neptune;

    }
}
