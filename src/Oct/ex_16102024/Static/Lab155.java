package Oct.ex_16102024.Static;

public class Lab155 {

    public static void main(String[] args) {


    ATB s1 = new ATB("sai");
    ATB s2 = new ATB("sai2");
    ATB s3 = new ATB("sai3");
    ATB s4 = new ATB("sai4");
    ATB s5;
    // new ATB("sai5");

        s1.readDocuments();
        ATB.doAssignments();

}

}


class ATB{


    {
        System.out.println("reading from CSV file");
    }
    static{
        System.out.println("Load the class? i will execute");
    }


    private String name;
    private String phone;
    static String coursename = "ATB8x";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public ATB(String name) {
        this.name = name;
    }

 void readDocuments(){
     System.out.println("non static method");
     System.out.println(coursename);
 }
 static void doAssignments(){
      //  System.out.println(phone);
        System.out.println("Do assignment");

    }

    static class GenAI{
        //0.000001% usage in automation
    }


}

