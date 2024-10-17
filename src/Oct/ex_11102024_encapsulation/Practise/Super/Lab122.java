package Oct.ex_11102024_encapsulation.Practise.Super;

public class Lab122 {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1();
        //dynamic dispatch
        t1.openBrowser("edge");
        t1.closeBrowser();
    }

}
