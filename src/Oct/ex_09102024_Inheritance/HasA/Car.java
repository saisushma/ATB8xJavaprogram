package Oct.ex_09102024_Inheritance.HasA;

public class Car {

    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}
