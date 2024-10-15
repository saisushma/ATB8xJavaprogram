package Oct.ex_14102024_Abstraction.realex2;

public class Lab116 {
    public static void main(String[] args) {

        P p = new P();
        p.f1();

        //I i = new I(); - cannot directly implement interface


    }
}

class P implements I{

    @Override
    public void f1() {
        System.out.println("P");
    }
}

interface I{

    void f1();
}