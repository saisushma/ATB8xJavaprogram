package Oct.ex_04102024_COnstructors_PC;

public class Lab96_AIHuman {
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
    void walk()
    {
        System.out.println("NRNR");
    }

    int talk(){
        System.out.println("RNR");
        return 10;
    }
    String sleep(String name){
        System.out.println("RWR");
        return name;
    }

}

