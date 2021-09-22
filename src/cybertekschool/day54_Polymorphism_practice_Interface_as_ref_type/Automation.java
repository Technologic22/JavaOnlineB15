package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

public class Automation {

    public static void main(String[] args) {

        WebDriver c1 = new ChromeDriver();
        ChromeDriver c2 = new ChromeDriver();

                                            // this is a polymorphism,
                                            // Chromedriver is an implementing class,
                                               // Webdriover is an interface
        c1.openBrowser();
        c1.navigateTo("www.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();

    }
}
