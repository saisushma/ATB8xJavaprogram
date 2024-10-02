package sept.ex_30092024_functions;

public class Lab75 {

    public static void main(String[] args) {

        // 1.without parameters and without return type
        Function1();
        //2.  without parameters but with return type
        Functn2();
        //3. with parameters and without return type
        Functn3("sai");
        // with multiple parameters and without return type
        Functn4("sai","chilukuri",29);
        //4. with parameters and with return type
        Functn5(45,50);

        //mostly we will be using Functn4 & Functn5 types

    }


    //without parameters but with return type
    //with parameters and without return type
    //with parameters and with return type


    //no return type and no argument
    // 1.without parameters and without return type


    public static void Function1()
    {
        System.out.println("this is a void function");
    }

    //2.  without parameters but with return type

    public static String Functn2()
    {
        System.out.println("  without parameters but with return type");
        return "Sai";
    }

    //with parameters and without return type

    public static void Functn3(String Name)
    {
        System.out.println("with parameters and without return type");
        System.out.println("you shared with "+Name);
    }

    // with multiple parameters and without return type

    public static void Functn4(String Name, String LastName, int age)
    {
        System.out.println("with parameters and without return type");
        System.out.println("you shared with "+Name);
        System.out.println("you shared with "+LastName);
        System.out.println(age);
    }

    //4. with parameters and with return type

    public static int Functn5(int n1, int n2)
    {
        System.out.println(" with parameters and with return type");
        return n1+n2;
    }
}
