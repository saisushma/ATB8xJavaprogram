package Oct.ex_11102024_encapsulation.Practise.Super;

public class TestCase1 extends BaseClass {

    //test case is a type of base class - single inheritance

    TestCase1() {
        super(); //Dc of parent
        //this.openBrowser();
    }
     @Override
        public void setBrowser(String browser,boolean isAuth)
        {
            super.setBrowser(browser, isAuth); //parent browser
        }
    }

