package Oct.ex_09102024_Inheritance.HasA;

public class Car {

    //car has a engine , Tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }
}
