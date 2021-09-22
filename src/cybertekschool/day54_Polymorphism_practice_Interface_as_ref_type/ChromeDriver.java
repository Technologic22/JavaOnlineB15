package cybertekschool.day54_Polymorphism_practice_Interface_as_ref_type;

public class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome Browser");

    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to " + url+" using Chrome Browser");

    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Chrome Browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");

    }
}
