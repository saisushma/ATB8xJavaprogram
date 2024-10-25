package Oct.ex_14102024_Abstraction.Practise;

public class Lab151 {

    public static void main(String[] args) {
        ChromeTC c = new ChromeTC();
        FireFox f = new FireFox();

        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.noBodyKnowsWhereIamPresent();

        f.openBrowser("firefox");
        f.closeBrowser("firefox");
    }
}
