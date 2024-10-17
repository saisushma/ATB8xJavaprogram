package Oct.ex_11102024_encapsulation.Practise.Super;

public class BaseClass {

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
       if(isAuth)
        this.browser = browser;
       else{
           System.out.println("not allowed");
       }
    }


     BaseClass() {
        System.out.println("DC - base class");
    }
    BaseClass(String b){
        System.out.println("CC - base class");
    }

    void openBrowser(){
        System.out.println("chrome browser..!1");
    }
    void openBrowser(String browserName){
        System.out.println(" Open browser.." +browserName);
    }
    void closeBrowser(){
        System.out.println("Close browser..!1");
    }
}
