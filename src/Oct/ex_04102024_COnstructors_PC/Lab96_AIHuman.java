package Oct.ex_04102024_COnstructors_PC;

public class Lab96_AIHuman {

    //creating attributes/instance variables
    String eye_Color;
    String planet = "AIHUMAN";
    String name;
    long aadhar_num ;

    //default constructor
    Lab96_AIHuman()
    {
        System.out.println("it will be called, object");
        //write a code here which will be automatiocally called when object is created
        //Read a file text
        //Read a CSV, excel here
    }

    //paramaterized constructor

    Lab96_AIHuman(String name){
        System.out.println("Hi, Im a paramterized constructor");
         this.name = name;
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

