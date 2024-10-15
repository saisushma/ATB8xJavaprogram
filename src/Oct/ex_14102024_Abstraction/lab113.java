package Oct.ex_14102024_Abstraction;

public class lab113 {
    public static void main(String[] args) {

        ChromeTC c = new ChromeTC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();

        FirefoxTC f = new FirefoxTC();

        f.openBrowser("firefox");
        f.closeBrowser("firefox");
    }
}
