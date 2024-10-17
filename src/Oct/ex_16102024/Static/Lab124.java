package Oct.ex_16102024.Static;

public class Lab124 {

    A a = new A();
    A a1 = new A();
   // new A();
    A a2;
}



class A{
    {
        System.out.println("IIB");
    }
    static{
        System.out.println("SIB");
    }
}