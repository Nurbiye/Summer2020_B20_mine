package day51_Exceptions.webDriver;
/*
4. create a class called Opera browser
            actions: get(URL): opens the URL in Opera browser
                     close(): closes the Opera browser
 */
public class OperaBrowser extends WebDriver {
    public void get(String url) {
        System.out.println("opens the " +url + " in Opera browser");
    }

    public void close(){
        System.out.println("closes the Opera browser");
    }




}
