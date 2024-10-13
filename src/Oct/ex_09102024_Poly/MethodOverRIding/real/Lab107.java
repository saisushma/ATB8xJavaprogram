package Oct.ex_09102024_Poly.MethodOverRIding.real;

public class Lab107 {
    public static void main(String[] args) {

        Mine m = new Mine();
        m.home();

        Father f = new Father();
        f.home();


        //dynamic dispatch


       // here we are creating reference using mine object
        Father object = new Mine();
        object.home();
    }
}
