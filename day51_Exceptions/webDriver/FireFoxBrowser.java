package day51_Exceptions.webDriver;
/*
3. creata a class called FirefoxBrowser
            actions: get(URL): opens the URL in Firefox browser
                     close(): closes the Firefox browser
 */
public class FireFoxBrowser extends WebDriver{
    public void get(String url) {
        System.out.println("opens the " +url + " in Firefox browser");
    }

    public void close(){
        System.out.println("closes the Firefox browser");
    }

}
