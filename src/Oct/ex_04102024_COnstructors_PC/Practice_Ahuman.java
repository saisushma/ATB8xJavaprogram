package Oct.ex_04102024_COnstructors_PC;

public class Practice_Ahuman {

    //creating attributes/instance variables
    String eye_Color;
    String planet = "AIHUMAN";
    String name ="sai";
    long aadhar_num ;

    Practice_Ahuman(){

        System.out.println("Im created when object is created");
        //code here will be automatically called when object is created
    }

    //paramterized constructor

    Practice_Ahuman(String name){
        this.name= name;
        System.out.println("Hi Im parameter constructor");
    }


    //behviour/methods

    //no return type no arguments
    void walk()
    {

        System.out.println("NRNR");
    }

    //return type with no aruguments
    int talk(){
        System.out.println("RNR");
        return 10;
    }

    //return type with return arugments
    String sleep(String name){
        System.out.println("RWR . sleeping");
        return "Im sleeping";
    }

    //no return type with arugments
    void eat(String name){
        System.out.println("eat");

    }


}

