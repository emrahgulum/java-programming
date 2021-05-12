package day34_void_methods;

public class EtsySearchTest {

    public static void main(String[] args) {
        System.out.println("--Starting ETSY Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        v();
    }
    public static void openBrowser() {
        System.out.println("Launching Chrome Browser");

    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to http://www.etsy.com/ ");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Pass: Verify Etsy home page is displayed.");
    }
    public static void v(){
        System.out.println("Pass: search results are displayed");
    }


}
