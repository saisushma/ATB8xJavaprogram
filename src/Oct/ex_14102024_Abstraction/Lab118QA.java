package Oct.ex_14102024_Abstraction;

public class Lab118QA {

}

interface I3{
    default void start(){
        System.out.println("Body, DM");
    }
   void stop();
    void car();

    static void ss(){
        System.out.println("static can also body in interface");
    }

}


abstract class AA{
    void fz(){
        System.out.println("concrete method");
    }
    abstract void fzz();

    static void f5(){
        System.out.println("yes");
    }
}