package Oct.ex_14102024_Abstraction;

public class FirefoxTC extends BaseClass{
    @Override
    void openBrowser(String browser){
        System.out.println("open the firefox");
    }
    @Override
    void closeBrowser(String browser)
    {
        System.out.println("close the firefox");
    }
}

