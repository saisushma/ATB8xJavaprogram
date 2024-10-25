package Oct.ex_14102024_Abstraction.Practise;

public class ChromeTC extends BaseClass{
    @Override
    void openBrowser(String browser) {
        super.openBrowser("open the chrome");
    }

    @Override
    void closeBrowser(String browser) {
        super.closeBrowser("close the chrome");
    }
}
