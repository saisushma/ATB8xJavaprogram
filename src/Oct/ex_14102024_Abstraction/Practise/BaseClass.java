package Oct.ex_14102024_Abstraction.Practise;

public class BaseClass extends GrandBaseClass{

    //web automation
    //single
    //hide the functionality of open and close browser

    void openBrowser(String browser){}
    void closeBrowser(String browser){}

    @Override
    void takeScreenshot() {

        System.out.println("taking screenshot using b astract");

    }
}
