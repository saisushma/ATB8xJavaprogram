package Oct.ex_14102024_Abstraction;

public class BaseClass extends GrandBaseClass {

    //web automation
    //single


    void openBrowser(String browser){}
    void closeBrowser(String browser){}

    @Override
    void takeScreenshot() {
        System.out.println("taking screenshot");
    }
}
