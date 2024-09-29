package sept.ex_23092024_switchconditions;

public class Lab63_QA {

    public static void main(String[] args) {

        //for web automatn, I will ask user which browser you wanted me to run teh code

        //chrome - execute chrome
        //firefox - execute the firefox
        //edge - edge cases;

        String browser = "OPERa";

        switch(browser) {
            case "chrome":
            System.out.println("running on chrome browser");
            break;
            case "firefox":
                System.out.println("running on firefox browser");
                break;
            case "edge":
                System.out.println("running on edge browser");
                break;
            default:
                System.out.println("I have no idea on which browser it is running");
                break;

        }
    }
}
