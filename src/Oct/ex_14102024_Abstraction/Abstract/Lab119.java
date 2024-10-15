package Oct.ex_14102024_Abstraction.Abstract;

public class Lab119 {

}

interface I1{
    int age = 10; //automatically its final
}
interface I2{}
class A{}
class B{}
class Test1 extends A{} //single inheritance
//class Test2 extends A,B{} //multiple inheritance is never possible
class Tes3 implements I1{}
class Test4 implements I1,I2{}
class Teste extends A implements I1,I2{}
