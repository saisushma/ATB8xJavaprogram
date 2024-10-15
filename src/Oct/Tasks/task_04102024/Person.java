package Oct.Tasks.task_04102024;

public class Person {
    //Create a Person Class with 10 A, 5 Behavr( All types of Methods)
    // and use the DC and PC to set the values, Create 5 Objects.

    String name;
    String fname;
    int age;
    String address;
    String gender;
    long aadharNum;
    boolean isWorking = true;
    String dob;
    long pincode;
    long phonenum;

    Person(){
        System.out.println("this is a default constructor");
        this.name = name;
    }

    Person(String name,String fname,long phonenum)
    {
        System.out.println("this is parameterized constructor");
        this.name = name;
        this.fname=fname;
        this.phonenum=phonenum;
        System.out.println(name+fname);
    }


    //no return with parameters
    void getaddress(String address,long pincode)
    {
        this.address=address;
        this.pincode=pincode;
        System.out.printf("address is %s \n",address);
        System.out.printf("pincode is %s \n", pincode);

    }
    //return with parameter
    int getAge(int age)
    {
        return age;
    }

    //return with no parameters
    boolean Working(){

        return true;
    }
    //no return with no parameters

    void read(){

        System.out.println("yes im reading");
    }

    void Personals(long aadhrNum, String gender )
    {
        System.out.printf("my gender: %s \n",gender);
        System.out.printf("my aadhranum: %d \n ",aadhrNum);
    }

}
