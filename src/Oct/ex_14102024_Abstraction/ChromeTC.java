package Oct.ex_14102024_Abstraction;

public class ChromeTC extends BaseClass{
    @Override
    void openBrowser(String browser){
        System.out.println("open the chrome");
    }
    void closeBrowser(String browser)
    {
        System.out.println("close the chrome");
    }
}

