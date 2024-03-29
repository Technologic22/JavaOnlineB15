package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

public class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser");

    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to " + url+" using Firefox Browser");

    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Firefox Browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }

}
