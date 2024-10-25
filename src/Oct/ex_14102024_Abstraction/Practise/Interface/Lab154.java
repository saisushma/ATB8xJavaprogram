package Oct.ex_14102024_Abstraction.Practise.Interface;

public class Lab154 {
}

interface I4{
    default void start(){

        System.out.println("body");
    }
    void start1();
    void car();

    static void ss(){
        System.out.println("static can also have body in the interface");
    }
}

abstract  class AA{
    void f1(){
        System.out.println("concerete method");
    }
    abstract void f2();
    }
