package Oct.ex_14102024_Abstraction.Practise.Interface;

public class Lab153 {
    public static void main(String[] args) {
       // I1 i = new I1();
//        ABC abc = new ABC();
//        abc.f3();
        XYZ xyz = new XYZ();
        xyz.display();

    }
}

class ABC implements I1,I2{

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }
}

class XYZ{

    void display(){
        new ABC().f4();
    }
}

interface I1{
    void f1();
    void f2();
}
interface I2{
    void f3();
    void f4();
}
