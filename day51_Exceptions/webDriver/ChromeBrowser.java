package day51_Exceptions.webDriver;
/*
2. create a class called ChromeBrowser
            actions: get(URL): opens the URL in chrome browser
                     close(): closes the chrome browser
 */
public class ChromeBrowser extends WebDriver{

    @Override //for checking if this method is overriding method
    public void get(String url) {
        System.out.println("opens the " +url + " in chrome browser");
    }

    @Override
  public void close(){

      System.out.println("closes the chrome browser");
  }
}
