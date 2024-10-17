package Oct.ex_11102024_encapsulation.Practise.Super;

public class Lab121 {

    //use of super with variables
    //use of super with methods
    //use of super with constrcutors

    public static void main(String[] args) {
        Car c = new Car();


    }

}

class Car extends Vehicle{
    private int maxSpeed = 281;

    void display(){
        System.out.println("im a this display");

    }
    Car(){
        super();
        System.out.println("Dc car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        this.display();
        super.display();
    }
}

class Vehicle{
    public int maxSpeed = 180;

     Vehicle() {
        System.out.println("DC vehicle");
    }
    Vehicle(int a){
        System.out.println("PC vehicle");
    }
    void display(){
        System.out.println("im super display");
    }
    void message(){
        System.out.println("hello vehicle");
    }
    void message(int a){
        System.out.println("hello vehicle");
    }
}