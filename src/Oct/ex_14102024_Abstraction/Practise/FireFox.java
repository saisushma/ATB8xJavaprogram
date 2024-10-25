package Oct.ex_14102024_Abstraction.Practise;

public class FireFox extends BaseClass {

    @Override
    void openBrowser(String browser) {
        super.openBrowser("Opening firefox");
    }

    @Override
    void closeBrowser(String browser) {
        super.closeBrowser("closing firefox");
    }
}
