package Oct.ex_14102024_Abstraction.realx;

public class Lab114 {

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan25k(); //completely hidden of father's
        s1.loan50k();
    }

}
