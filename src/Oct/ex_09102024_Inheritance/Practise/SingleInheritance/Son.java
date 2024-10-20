package Oct.ex_09102024_Inheritance.Practise.SingleInheritance;

public class Son extends Father {

    //son - > father
    void bhk3(){
        System.out.println("3bhk");
        //attribute of a father
        System.out.println(gold_f);
        //behvaiour
        bhk2();
    }
}
